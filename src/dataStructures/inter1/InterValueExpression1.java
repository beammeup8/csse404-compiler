package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.TermType;
import dataStructures.simpleInter.Assignment;
import dataStructures.simpleInter.Statement;

public class InterValueExpression1 implements IInterExpression1 {

	private String id, symbol, localId;
	private TermType type;
	private SymbolTable table;

	public InterValueExpression1(TermType type) {
		this(type, null);
	}

	public InterValueExpression1(TermType type, String symbol) {
		id = IdGenerator.getUniqueId();
		this.type = type;
		if (type == TermType.INTEGER) {
			this.symbol = "{" + symbol + "}";
		} else if (type == TermType.TRUE) {
			this.symbol = "{1}";
		} else if (type == TermType.FALSE) {
			this.symbol = "{0}";
		} else{
			this.symbol = symbol;
		}
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		table = parent;
		if(type == TermType.ID){
			localId = parent.getLocalName(symbol);
		}
		else{
			localId = symbol;
		}
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
	public List<Statement> toStatementList() {
		List<Statement> stmt = new ArrayList<>();
		stmt.add(new Assignment(localId, id));
		return stmt;
	}

}
