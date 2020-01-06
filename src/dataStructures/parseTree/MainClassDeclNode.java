package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

/**
 * MainClassDecl -> class ID { public static void main ( String [ ] ID ) { StmtLst } }
 * 
 * @author mastermk beemanla
 *
 */
public class MainClassDeclNode extends Node {

	public MainClassDeclNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		addTerminal(tags, head, initialHead, "class");
		addID(tags, head, initialHead);
		addTerminal(tags, head, initialHead, "{");
		addTerminal(tags, head, initialHead, "public");
		addTerminal(tags, head, initialHead, "static");
		addTerminal(tags, head, initialHead, "void");
		addTerminal(tags, head, initialHead, "main");
		addTerminal(tags, head, initialHead, "(");
		addTerminal(tags, head, initialHead, "String");
		addTerminal(tags, head, initialHead, "[");
		addTerminal(tags, head, initialHead, "]");
		addID(tags, head, initialHead);
		addTerminal(tags, head, initialHead, ")");
		addTerminal(tags, head, initialHead, "{");
		addNonTerminal(tags, head, initialHead, ParserType.StmtLst);
		addTerminal(tags, head, initialHead, "}");
		addTerminal(tags, head, initialHead, "}");
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
