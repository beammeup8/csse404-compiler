package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class MethodDeclLstNode extends Node {

	public MethodDeclLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addNonTerminal(tags, head, initialHead, ParserType.MethodDecl);
			addNonTerminal(tags, head, initialHead, ParserType.MethodDeclLst);
		} catch (CustomException e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.MethodDeclLst;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub.

	}

}
