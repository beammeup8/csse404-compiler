package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class MainClassDeclNode extends Node {

	// MainClassDecl -> class ID { public static void main ( String [  ] ID ) { StmtLst } }
	public MainClassDeclNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		addTerminal(tags, head, initialHead, "class");
		addID(tags, head, initialHead);
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

	@Override
	public ParserType getType() {
		return ParserType.MainClassDecl;
	}

}
