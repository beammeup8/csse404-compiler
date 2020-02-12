package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Print;
import dataStructures.simpleInter.Statement;
import exceptions.CustomException;
import exceptions.IncompatibleTypeException;

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
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) throws CustomException {
		toPrint.populateSymbolTable(parent, classMap);
		if (!toPrint.getType().equals("int")) {
			throw new IncompatibleTypeException("Print can only print integers");
		}
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<Statement>();
		block.addAll(toPrint.toStatementList());
		block.add(new Print(toPrint.getId()));
		return block;
	}

}
