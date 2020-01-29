package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Statement;

public class InterMultiStatement1 implements IInterStatement1 {
	private List<IInterStatement1> statements;

	public InterMultiStatement1(List<IInterStatement1> interStatements) {
		statements = interStatements;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		SymbolTable table = new SymbolTable(parent);
		statements.forEach(x -> x.populateSymbolTable(table, classMap));
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<Statement>();
		for(int i = 0; i < statements.size(); i ++){
			block.addAll(statements.get(i).toStatementList());
		}
		return block;
	}

}
