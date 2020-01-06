package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class CompExprNode extends Node {

	public CompExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addNonTerminal(tags, head, initialHead, ParserType.Comparator);
			addNonTerminal(tags, head, initialHead, ParserType.AddSub);
			addNonTerminal(tags, head, initialHead, ParserType.CompExpr);
		} catch (CustomException e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.CompExpr;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
