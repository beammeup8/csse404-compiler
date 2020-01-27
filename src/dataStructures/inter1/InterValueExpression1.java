package dataStructures.inter1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import dataStructures.TermType;
import dataStructures.simpleInter.Statements;

public class InterValueExpression1 implements IInterExpression1 {

	private String id, symbol;
	private TermType type;
	private SymbolTable table;

	public InterValueExpression1(TermType type) {
		this(type, null);
	}

	public InterValueExpression1(TermType type, String symbol) {
		id = IdGenerator.getUniqueId();
		this.type = type;
		this.symbol = symbol;
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		table = parent;
	}

	@Override
	public String getType() {
		switch (type){
		case NEW_ARRAY:
		case NEW_CLASS_INSTANCE:
		case EXPRESSION:
			System.err.println("Invalid Value Expression Type");
			System.exit(0);
		case TRUE:
		case FALSE:
			return "boolean";
		case ID:
			return table.getType(symbol);
		case INTEGER:
			return "int";
		case NULL:
			return "null";
		case THIS:
			return table.getType("this");
		default:
			break;
		}
		return null;
	}

	@Override
	public List<Statements> toStatementList() {
		// TODO Auto-generated method stub
		return new ArrayList<Statements>();
	}

}
