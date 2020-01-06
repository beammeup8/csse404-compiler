package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class FirstParamNode extends Node {

	public FirstParamNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addNonTerminal(tags, head, initialHead, ParserType.Expr);
			addNonTerminal(tags, head, initialHead, ParserType.ParamLst);
		} catch (Exception e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.FirstParam;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
