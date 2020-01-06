package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class MethodCallNode extends Node {

	public MethodCallNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		String symbol = tags.get(head.integer).symbol;
		try {
			if (symbol.equals("[")) {
				addTerminal(tags, head, initialHead, "[");
				addNonTerminal(tags, head, initialHead, ParserType.Expr);
				addTerminal(tags, head, initialHead, "]");
				addNonTerminal(tags, head, initialHead, ParserType.MethodCall);
			} else {
				addTerminal(tags, head, initialHead, ".");
				if (tags.get(head.integer).symbol.equals("length") && !tags.get(head.integer + 1).symbol.equals("(")) {
					addTerminal(tags, head, initialHead, "length");
				} else {
					addID(tags, head, initialHead);
					addTerminal(tags, head, initialHead, "(");
					addNonTerminal(tags, head, initialHead, ParserType.FirstParam);
					addTerminal(tags, head, initialHead, ")");
				}
			}
			addNonTerminal(tags, head, initialHead, ParserType.MethodCall);
		} catch (CustomException e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.MethodCall;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
