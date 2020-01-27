package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Statements;

public class InterMethodCall1 implements IInterExpression1 {

	private String id, methodId;
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
	public void populateSymbolTable(SymbolTable parent) {
		table = parent;
		calledOn.populateSymbolTable(parent);
		parameters.forEach(x -> x.populateSymbolTable(parent));
	}

	@Override
	public String getType() {
		String methodType = table.getType(calledOn.getType() + "." + methodId).substring(7);
		return methodType;
	}

	@Override
	public Statements toStatement() {
		// TODO Auto-generated method stub
		return new CodeBlock();
	}

	@Override
	public List<Statements> toStatementList() {
		// TODO Auto-generated method stub
		return new ArrayList<Statements>();
	}

}
