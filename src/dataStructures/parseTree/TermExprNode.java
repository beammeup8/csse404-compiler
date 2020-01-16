package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.LexerType;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;

public class TermExprNode extends Node {
	private enum TermType {
		NEW_CLASS_INSTANCE, ID, THIS, INTEGER, NULL, TRUE, FALSE, EXPRESSION, NEW_ARRAY
	}

	private TermType type;
	private TerminalNode id;
	private ExprNode expression;
	private TerminalNode integerVal;

	public TermExprNode(List<Tag> tags, IntWrap head) throws CustomException {
		String symbol = tags.get(head.integer).symbol;
		if (symbol.equals("this")) {
			validateTerminal(tags, head, "this");
			type = TermType.THIS;
		} else if (symbol.equals("null")) {
			validateTerminal(tags, head, "null");
			type = TermType.NULL;
		} else if (symbol.equals("true")) {
			validateTerminal(tags, head, "true");
			type = TermType.TRUE;
		} else if (symbol.equals("false")) {
			validateTerminal(tags, head, "false");
			type = TermType.FALSE;
		} else if (tags.get(head.integer).type == LexerType.Integer) {
			integerVal = addInteger(tags, head);
			type = TermType.INTEGER;
		} else if (symbol.equals("new")) {
			validateTerminal(tags, head, "new");
			if (tags.get(head.integer).symbol.equals("int")) {
				validateTerminal(tags, head, "int");
				validateTerminal(tags, head, "[");
				expression = new ExprNode(tags, head);
				validateTerminal(tags, head, "]");
				type = TermType.NEW_ARRAY;
			} else {
				id = addID(tags, head);
				validateTerminal(tags, head, "(");
				validateTerminal(tags, head, ")");
				type = TermType.NEW_CLASS_INSTANCE;
			}
		} else if (symbol.equals("(")) {
			validateTerminal(tags, head, "(");
			expression = new ExprNode(tags, head);
			validateTerminal(tags, head, ")");
			type = TermType.EXPRESSION;
		} else {
			id = addID(tags, head);
			type = TermType.ID;
		}
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		switch (type) {
		case EXPRESSION:
			return "( " + expression.toString() + " )"; 
		case FALSE:
			return " false ";
		case ID:
			return id.toString();
		case INTEGER:
			return integerVal.toString();
		case NEW_ARRAY:
			return "( new int [ " + expression.toString() + " ] )"; 
		case NEW_CLASS_INSTANCE:
			return "( new " + id.toString() + "() )";
		case NULL:
			return " null ";
		case THIS:
			return " this ";
		case TRUE:
			return " true ";
		}
		return null;
	}

	public IInterExpression1 convertToInter1() {
		// TODO Auto-generated method stub.
		return null;
	}

}
