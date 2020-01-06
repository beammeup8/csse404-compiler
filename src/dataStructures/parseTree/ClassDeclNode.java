package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

/**
 * ClassDecl -> class ID Extnd { ClassVarDecLst MethodDeclLst } ClassDecl |
 * EPSILON
 * 
 * @author mastermk beemanla
 *
 */
public class ClassDeclNode extends Node {

	public ClassDeclNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addTerminal(tags, head, initialHead, "class");
			addID(tags, head, initialHead);
			addNonTerminal(tags, head, initialHead, ParserType.Extnd);
			addTerminal(tags, head, initialHead, "{");
			addNonTerminal(tags, head, initialHead, ParserType.ClassVarDeclLst);
			addNonTerminal(tags, head, initialHead, ParserType.MethodDeclLst);
			addTerminal(tags, head, initialHead, "}");
			addNonTerminal(tags, head, initialHead, ParserType.ClassDecl);
		} catch (Exception e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

	@Override
	public ParserType getType() {
		return ParserType.ClassDecl;
	}

}
