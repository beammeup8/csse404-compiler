package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class CompNode extends Node {

	public CompNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead, ParserType.AddSub);
		addNonTerminal(tags, head, initialHead, ParserType.CompExpr);
	}

	@Override
	public ParserType getType() {
		return ParserType.Comp;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
