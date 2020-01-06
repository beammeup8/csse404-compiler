package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class ClassVarDeclNode extends Node {

	public ClassVarDeclNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead , ParserType.Decl);
		addTerminal(tags, head, initialHead, ";");
	}

	@Override
	public ParserType getType() {
		return ParserType.ClassVarDecl;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
