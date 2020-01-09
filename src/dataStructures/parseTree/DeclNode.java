package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class DeclNode extends Node {

	public DeclNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead, ParserType.Type);
		addID(tags, head, initialHead);
	}

	@Override
	public ParserType getType() {
		return ParserType.Decl;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
