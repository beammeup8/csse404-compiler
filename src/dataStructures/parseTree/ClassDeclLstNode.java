package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

/**
 * ClassDeclLst -> ClassDecl ClassDeclLst | EPSILON
 * 
 * @author mastermk beemanla
 *
 */
public class ClassDeclLstNode extends Node {

	public ClassDeclLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addNonTerminal(tags, head, initialHead, ParserType.ClassDecl);
			addNonTerminal(tags, head, initialHead, ParserType.ClassDeclLst);
		} catch (Exception e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.ClassDeclLst;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
