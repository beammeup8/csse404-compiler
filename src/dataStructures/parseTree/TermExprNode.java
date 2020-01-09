package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.LexerType;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class TermExprNode extends Node {

	public TermExprNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		String symbol = tags.get(head.integer).symbol;
		if (symbol.equals("this") || symbol.equals("null") || symbol.equals("true") || symbol.equals("false")) {
			addTerminal(tags, head, initialHead, symbol);
		} else if (symbol.equals("new")) {
			addTerminal(tags, head, initialHead, "new");
			if (tags.get(head.integer).symbol.equals("int")) {
				addTerminal(tags, head, initialHead, "int");
				addTerminal(tags, head, initialHead, "[");
				addNonTerminal(tags, head, initialHead, ParserType.Expr);
				addTerminal(tags, head, initialHead, "]");
			} else {
				addID(tags, head, initialHead);
				addTerminal(tags, head, initialHead, "(");
				addTerminal(tags, head, initialHead, ")");
			}
		} else if (symbol.equals("(")) {
			addTerminal(tags, head, initialHead, "(");
			addNonTerminal(tags, head, initialHead, ParserType.Expr);
			addTerminal(tags, head, initialHead, ")");
		} else if (tags.get(head.integer).type == LexerType.Integer) {
			addInteger(tags, head, initialHead);
		} else {
			addID(tags, head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.TermExpr;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
