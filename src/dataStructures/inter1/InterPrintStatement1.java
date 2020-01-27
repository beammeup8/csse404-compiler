package dataStructures.inter1;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Statements;

public class InterPrintStatement1 implements IInterStatement1 {

	private IInterExpression1 toPrint;
	
	public InterPrintStatement1(IInterExpression1 toPrint) {
		this.toPrint = toPrint;
	}
	
	@Override
	public String toString() {
		return "Print: {toPrint: " + toPrint.toString() + "}";
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		toPrint.populateSymbolTable(parent);
		if(!toPrint.getType().equals("int")){
			System.err.println("Print can only print integers");
			System.exit(0);
		}
	}

	@Override
	public Statements toStatement() {
		//TODO figure out the mess that is IO
		return new CodeBlock();
	}

}
