package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;

import dataStructures.simpleInter.Statements;

public class InterArrayAccess1 implements IInterExpression1 {
	
	IInterExpression1 arrayExpression, arrayIndex;
	private String id;

	public InterArrayAccess1(IInterExpression1 arrayExpression, IInterExpression1 arrayIndex) {
		this.arrayExpression = arrayExpression;
		this.arrayIndex = arrayIndex;
		this.id = IdGenerator.getUniqueId();
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		arrayExpression.populateSymbolTable(parent);
		arrayExpression.populateSymbolTable(parent);
	}

	@Override
	public String getType() {
		return "int";
	}

	@Override
	public Statements toStatement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Statements> toStatementList() {
		// TODO Auto-generated method stub
		return new ArrayList<Statements>();
	}

}
