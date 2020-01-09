package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class MultDivNode extends Node {

	public MultDivNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead, ParserType.NegExpr);
		addNonTerminal(tags, head, initialHead, ParserType.MultDivExpr);
	}

	@Override
	public ParserType getType() {
		return ParserType.MultDiv;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
