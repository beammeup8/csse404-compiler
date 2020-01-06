package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class ParamLstNode extends Node {

	public ParamLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addTerminal(tags, head, initialHead, ",");
			addNonTerminal(tags, head, initialHead, ParserType.Expr);
			addNonTerminal(tags, head, initialHead, ParserType.ParamLst);
		} catch (Exception e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.ParamLst;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub.

	}

}
