package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class ComparatorNode extends Node {

	public ComparatorNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		String symbol = tags.get(head.integer).symbol;
		if (symbol.equals("<") || symbol.equals("<=") || symbol.equals(">=") || symbol.equals(">")
				|| symbol.equals("==") || symbol.equals("!=")) {
			addTerminal(tags, head, initialHead, symbol);
		}else {
			throw new Exception("Comparator: " + symbol + " not found");
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.Comparator;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
