package dataStructures.parseTree;

import dataStructures.LexerType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class TerminalNode extends Node {
	public String symbol;
	private LexerType lexerType;
	
	public TerminalNode(Tag tag) {
		symbol = tag.symbol;
		lexerType = tag.type;
	}
	
	@Override
	public void optimize() {
		return;
	}
	
	@Override
	public String toString() {
		return "( Terminal: " + lexerType.name() + " " + symbol + " )";
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
