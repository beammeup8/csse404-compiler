package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class ClassVarDeclNode extends Node {

	public ClassVarDeclNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead , ParserType.Decl);
		addTerminal(tags, head, initialHead, ";");
	}

	@Override
	public ParserType getType() {
		return ParserType.ClassVarDecl;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
