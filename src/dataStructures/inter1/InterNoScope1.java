package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Statement;

public class InterNoScope1 implements IInterStatement1 {

	private List<IInterStatement1> statements;

	public InterNoScope1(List<IInterStatement1> interStatements) {
		statements = interStatements;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		statements.forEach(x -> x.populateSymbolTable(parent, classMap));
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
