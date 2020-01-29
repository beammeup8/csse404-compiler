package dataStructures.inter1;

import java.util.Map;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Print;
import dataStructures.simpleInter.Statement;

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
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		toPrint.populateSymbolTable(parent, classMap);
		if (!toPrint.getType().equals("int")) {
			System.err.println("Print can only print integers");
			System.exit(0);
		}
	}

	@Override
	public Statement toStatement() {
		CodeBlock block = new CodeBlock();
		block.addAll(toPrint.toStatementList());
		block.add(new Print(toPrint.getId()));
		return block;
	}

}
