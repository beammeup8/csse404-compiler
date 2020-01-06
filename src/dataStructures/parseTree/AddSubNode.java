package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class AddSubNode extends Node {

	public AddSubNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead, ParserType.MultDiv);
		addNonTerminal(tags, head, initialHead, ParserType.AddSubExpr);
	}

	@Override
	public ParserType getType() {
		return ParserType.AddSub;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
