package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class AddSubNode extends Node {

	public AddSubNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead, ParserType.MultDiv);
		addNonTerminal(tags, head, initialHead, ParserType.AddSubExpr);
	}

	@Override
	public ParserType getType() {
		return ParserType.AddSub;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
