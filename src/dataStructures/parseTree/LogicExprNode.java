package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class LogicExprNode extends Node {

	public LogicExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			if (tags.get(head.integer).symbol.equals("&&")) {
				addTerminal(tags, head, initialHead, "&&");
			}
			else {
				addTerminal(tags, head, initialHead, "||");
			}
			addNonTerminal(tags, head, initialHead, ParserType.Comp);
			addNonTerminal(tags, head, initialHead, ParserType.LogicExpr);
		} catch (CustomException e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.LogicExpr;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
