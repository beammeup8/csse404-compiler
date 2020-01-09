package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class ParamLstNode extends Node {

	public ParamLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addTerminal(tags, head, initialHead, ",");
			addNonTerminal(tags, head, initialHead, ParserType.Expr);
			addNonTerminal(tags, head, initialHead, ParserType.ParamLst);
		} catch (CustomException e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.ParamLst;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
