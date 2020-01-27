package dataStructures.inter1;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Statements;

public class InterWhile implements IInterStatement1 {
	private IInterExpression1 conditional;
	private IInterStatement1 body;

	public InterWhile(IInterExpression1 conditional, IInterStatement1 body) {
		this.conditional = conditional;
		this.body = body;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		conditional.populateSymbolTable(parent);
		body.populateSymbolTable(new SymbolTable(parent));
		if(!conditional.getType().equals("boolean")){
			System.err.println("While loops can only have boolean conditionals");
			System.exit(0);
		}
	}

	@Override
	public Statements toStatement() {
		// TODO Auto-generated method stub
		return new CodeBlock();
	}

}
