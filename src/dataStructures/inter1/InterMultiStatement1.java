package dataStructures.inter1;

import java.util.List;

public class InterMultiStatement1 implements IInterStatement1 {
	private List<IInterStatement1> statements;

	public InterMultiStatement1(List<IInterStatement1> interStatements) {
		statements = interStatements;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		SymbolTable table = new SymbolTable(parent);
		statements.forEach(x -> x.populateSymbolTable(table));
	}

}
