package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import Exceptions.DefaultException;
import Exceptions.IncorrectOperatorFound;
import dataStructures.IntWrap;
import dataStructures.LexerType;
import dataStructures.OpType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public abstract class Node {

	public abstract AbstractStructure convertToInternal();

	public abstract void optimize();

	@Override
	public String toString(){
		System.err.println("This toString should never be called.");
		return null;
	}

	protected TerminalNode addInteger(List<Tag> tags, IntWrap head) throws CustomException {
		Tag tag = tags.get(head.integer);
		if (tag.type != LexerType.Integer) {
			throw new DefaultException("Integer not found: " + tag.toString());
		}
		TerminalNode node = new TerminalNode(tag);
		head.integer++;
		return node;
	}

	protected TerminalNode addOp(List<Tag> tags, IntWrap head, OpType op) throws CustomException {
		Tag tag = tags.get(head.integer);
		if (tag.type != LexerType.Operator) {
			throw new DefaultException("Operator not found: " + tag.toString());
		}
		String symbol = tag.symbol;
		switch (op) {
		case ADDITIVE:
			if (!symbol.equals("+") && !symbol.equals("-")) {
				throw new IncorrectOperatorFound(symbol);
			}
			break;
		case COMPARISON:
			if (!symbol.equals("<") && !symbol.equals(">") && !symbol.equals("<=") && !symbol.equals("=>")) {
				throw new IncorrectOperatorFound(symbol);
			}
			break;
		case EQUALITY:
			if (!symbol.equals("==") && !symbol.equals("!=")) {
				throw new IncorrectOperatorFound(symbol);
			}
			break;
		case LOGIC:
			if (!symbol.equals("&&") && !symbol.equals("||")) {
				throw new IncorrectOperatorFound(symbol);
			}
			break;
		case MULTIPLICATIVE:
			if (!symbol.equals("*") && !symbol.equals("/")) {
				throw new IncorrectOperatorFound(symbol);
			}
			break;
		case NEGATION:
			if (!symbol.equals("!") && !symbol.equals("-")) {
				throw new IncorrectOperatorFound(symbol);
			}
			break;
		}

		TerminalNode node = new TerminalNode(tag);
		head.integer++;
		return node;
	}

	protected TerminalNode addID(List<Tag> tags, IntWrap head) throws CustomException {
		Tag tag = tags.get(head.integer);
		if (tag.type != LexerType.ID) {
			throw new DefaultException("ID not found: " + tag.toString());
		}
		TerminalNode node = new TerminalNode(tag);
		head.integer++;
		return node;
	}

	protected TerminalNode addTerminal(List<Tag> tags, IntWrap head, String symbol) throws CustomException {
		Tag tag = tags.get(head.integer);
		if (!tag.symbol.equals(symbol)) {
			throw new DefaultException("Bad Symbol: \"" + tag.symbol + "\",  Expected Symbol: \"" + symbol + "\"");
		}
		TerminalNode node = new TerminalNode(tag);
		head.integer++;
		return node;
	}

	protected void validateTerminal(List<Tag> tags, IntWrap head, String symbol) throws CustomException {
		Tag tag = tags.get(head.integer);
		if (!tag.symbol.equals(symbol)) {
			throw new DefaultException("Bad Symbol: \"" + tag.symbol + "\",  Expected Symbol: \"" + symbol + "\"");
		}
		head.integer++;
	}
}
