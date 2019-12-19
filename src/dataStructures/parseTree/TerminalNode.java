package dataStructures.parseTree;

import dataStructures.LexerType;
import dataStructures.ParserType;
import dataStructures.Tag;

public class TerminalNode extends Node {
	private String symbol;
	private LexerType lexerType;
	
	public TerminalNode(Tag tag) {
		symbol = tag.symbol;
		lexerType = tag.type;
	}
	
	@Override
	public String toString() {
		return "( Terminal: " + lexerType.name() + " " + symbol + " )";
	}

	@Override
	public ParserType getType() {
		return ParserType.Terminal;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
