package dataStructures.parseTree;

import dataStructures.LexerType;
import dataStructures.Tag;

public class TerminalNode extends Node {
	public String symbol;
	private LexerType lexerType;

	public TerminalNode(Tag tag) {
		symbol = tag.symbol;
		lexerType = tag.type;
	}

	@Override
	public String toString() {
		return "( Terminal: " + lexerType.name() + " " + symbol + " )";
	}

}
