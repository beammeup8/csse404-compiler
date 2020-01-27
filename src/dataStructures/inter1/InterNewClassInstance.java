package dataStructures.inter1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Statements;

public class InterNewClassInstance implements IInterExpression1 {

	private String id, className;
	
	public InterNewClassInstance(String className) {
		id = IdGenerator.getUniqueId();
		this.className = className;
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		//TODO check class name later
	}

	@Override
	public String getType() {
		return className;
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
