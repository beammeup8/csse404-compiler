package dataStructures.inter1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Statements;

public class InterNewArrayInstance implements IInterExpression1 {

	private String id;
	private IInterExpression1 length;
	
	public InterNewArrayInstance(IInterExpression1 length) {
		id = IdGenerator.getUniqueId();
		this.length = length;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		length.populateSymbolTable(parent);
		if(!length.getType().equals("int")){
			System.err.println("Arrays must have a numeric length");
			System.exit(0);
		}
		
	}

	@Override
	public String getType() {
		return "int[]";
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
