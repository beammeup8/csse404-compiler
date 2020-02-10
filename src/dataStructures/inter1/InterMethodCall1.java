package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Assignment;
import dataStructures.simpleInter.Jump;
import dataStructures.simpleInter.JumpType;
import dataStructures.simpleInter.OpType;
import dataStructures.simpleInter.Operation;
import dataStructures.simpleInter.StackOpType;
import dataStructures.simpleInter.StackOperation;
import dataStructures.simpleInter.Statement;

public class InterMethodCall1 implements IInterExpression1 {

	private String id, methodId, localMethodName;
	private IInterExpression1 calledOn;
	private List<IInterExpression1> parameters;
	private SymbolTable table;

	public InterMethodCall1(IInterExpression1 calledOn, String methodId, List<IInterExpression1> parameters) {
		id = IdGenerator.getUniqueId();
		this.calledOn = calledOn;
		this.methodId = methodId;
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		return "Method Call: {calledOn: " + calledOn.toString() + ", methodId: " + methodId + ", parameters: "
				+ parameters.toString() + "}";
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		table = parent;
		calledOn.populateSymbolTable(parent, classMap);
		parameters.forEach(x -> x.populateSymbolTable(parent, classMap));
		localMethodName = parent.getLocalName(calledOn.getType() + "." + methodId);
	}

	@Override
	public String getType() {
		String methodType = table.getType(calledOn.getType() + "." + methodId).substring(7);
		return methodType;
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<Statement>();
		block.addAll(calledOn.toStatementList());

		for(int i = 0; i < parameters.size(); i ++){
			block.addAll(parameters.get(i).toStatementList());
		}

		for (int i = parameters.size() - 1; i >= 0; i--) {
			block.add(new StackOperation(parameters.get(i).getId(), StackOpType.PUSH));
		}
		block.add(new StackOperation(calledOn.getId(), StackOpType.PUSH));
		
		block.add(new Jump(localMethodName, JumpType.CALL));
		
		block.add(new Operation("ESP", "" + 4*(parameters.size()+1), "ESP", OpType.ADD));
		
		block.add(new Assignment("EAX", id));
		
		return block;
	}

}
