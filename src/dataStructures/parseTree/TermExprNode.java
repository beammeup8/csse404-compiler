package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.LexerType;
import dataStructures.Tag;
import dataStructures.TermType;
import dataStructures.inter1.IInterExpression1;
import dataStructures.inter1.InterNewArrayInstance;
import dataStructures.inter1.InterNewClassInstance;
import dataStructures.inter1.InterValueExpression1;
import exceptions.CustomException;

public class TermExprNode extends Node {
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
		switch (type) {
		case EXPRESSION:
			return expression.convertToInter1();
		case NEW_ARRAY:
			return new InterNewArrayInstance(expression.convertToInter1());
		case NEW_CLASS_INSTANCE:
			return new InterNewClassInstance(id.symbol);
		case ID:
			return new InterValueExpression1(type, id.symbol);
		case INTEGER:
			return new InterValueExpression1(type, integerVal.symbol);
		case NULL:
		case THIS:
		case TRUE:
		case FALSE:
			return new InterValueExpression1(type);
		}
		System.err.println("Invalid enum: Terminal Expression");
		return null;
	}

}
