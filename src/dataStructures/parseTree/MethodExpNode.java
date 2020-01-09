package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class MethodExpNode extends Node {

	public MethodExpNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead , ParserType.TermExpr);
		addNonTerminal(tags, head, initialHead, ParserType.MethodCall);
	}

	@Override
	public ParserType getType() {
		return ParserType.MethodExpr;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
