package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class TermExprNode extends Node {

	public TermExprNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		String symbol = tags.get(head.integer).symbol;
		if(symbol.equals("this") || symbol.equals("true") || symbol.equals("false")){
			addTerminal(tags, head, initialHead, symbol);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.TermExpr;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub.

	}

}
