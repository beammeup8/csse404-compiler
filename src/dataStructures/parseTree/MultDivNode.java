package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class MultDivNode extends Node {

	public MultDivNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead, ParserType.NegExpr);
		addNonTerminal(tags, head, initialHead, ParserType.MultDivExpr);
	}

	@Override
	public ParserType getType() {
		return ParserType.MultDiv;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub.

	}

}
