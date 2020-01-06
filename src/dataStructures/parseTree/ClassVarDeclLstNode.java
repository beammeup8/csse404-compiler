package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class ClassVarDeclLstNode extends Node {

	public ClassVarDeclLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addNonTerminal(tags, head, initialHead, ParserType.ClassVarDecl);
			addNonTerminal(tags, head, initialHead, ParserType.ClassVarDeclLst);
		} catch (Exception e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.ClassVarDeclLst;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
