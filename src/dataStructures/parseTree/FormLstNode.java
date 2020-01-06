package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class FormLstNode extends Node {

	public FormLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addTerminal(tags, head, initialHead, ",");
			addNonTerminal(tags, head, initialHead, ParserType.Formal);
			addNonTerminal(tags, head, initialHead, ParserType.FormLst);
		} catch (CustomException exception) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.FormLst;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
