package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class NegExprNode extends Node {

	public NegExprNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		String symbol = tags.get(head.integer).symbol;
		if (symbol.equals("!") || symbol.equals("-")) {
			addTerminal(tags, head, initialHead, symbol);
			addNonTerminal(tags, head, initialHead, ParserType.NegExpr);
		}else{
			addNonTerminal(tags, head, initialHead, ParserType.MethodExpr);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.NegExpr;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
