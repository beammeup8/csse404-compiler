package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class AddSubExprNode extends Node {

	public AddSubExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			if (tags.get(head.integer).symbol.equals("+")) {
				addTerminal(tags, head, initialHead, "+");
			}
			else {
				addTerminal(tags, head, initialHead, "-");
			}
			addNonTerminal(tags, head, initialHead, ParserType.MultDiv);
			addNonTerminal(tags, head, initialHead, ParserType.AddSubExpr);
		} catch (Exception e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.AddSubExpr;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
