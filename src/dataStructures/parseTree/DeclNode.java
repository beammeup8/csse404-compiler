package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class DeclNode extends Node {

	public DeclNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead, ParserType.Type);
		addID(tags, head, initialHead);
	}

	@Override
	public ParserType getType() {
		return ParserType.Decl;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
