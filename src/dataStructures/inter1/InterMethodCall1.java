package dataStructures.inter1;

import java.util.List;
import java.util.Map;
import java.util.Stack;

import dataStructures.simpleInter.Assignment;
import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Jump;
import dataStructures.simpleInter.JumpType;
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
		return "Method Call: {calledOn: " + calledOn.toString() + ", methodId: " + methodId + ", parameters: " + parameters.toString() + "}";
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
	public Statement toStatement() {
		CodeBlock block = new CodeBlock();
		block.addAll(calledOn.toStatementList());
		
		parameters.forEach(x -> block.addAll(x.toStatementList()));
		
		for(int i = parameters.size() - 1; i >= 0; i --){
			block.add(new StackOperation(parameters.get(i).getId(), true));
		}
		block.add(new Jump(localMethodName, JumpType.CALL));
		return block;
	}

	@Override
	public List<Statement> toStatementList() {
		return ((CodeBlock) toStatement()).statements;
	}

}
