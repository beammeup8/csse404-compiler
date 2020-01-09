package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class FormalNode extends Node {

	public FormalNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addNonTerminal(tags, head, initialHead, ParserType.Decl);
			addNonTerminal(tags, head, initialHead, ParserType.FormLst);
		} catch (CustomException exception) {
			setToEpsilon(head, initialHead);
		}
		
	}

	@Override
	public ParserType getType() {
		return ParserType.Formal;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
