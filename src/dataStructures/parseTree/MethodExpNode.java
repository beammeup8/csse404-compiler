package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class MethodExpNode extends Node {

	public MethodExpNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead , ParserType.TermExpr);
		addNonTerminal(tags, head, initialHead, ParserType.MethodCall);
	}

	@Override
	public ParserType getType() {
		return ParserType.MethodExpr;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
