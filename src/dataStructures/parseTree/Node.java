package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import Exceptions.CustomException;
import Exceptions.DefaultException;
import dataStructures.IntWrap;
import dataStructures.LexerType;
import dataStructures.ParserType;
import dataStructures.Tag;

public abstract class Node implements Iterable<Node> {
	protected List<Node> children;

	public Node() {
		this.children = new ArrayList<Node>();
	}

	public abstract ParserType getType();

	public abstract void optimize();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("( ");
		builder.append(getType().name());
		builder.append(" ");

		for (int i = 0; i < children.size(); i++) {
			builder.append(children.get(i).toString());
		}

		builder.append(")");
		return builder.toString();
	}
	
	protected void addInteger(List<Tag> tags, IntWrap head, int initialHead) throws CustomException {
		Tag tag = tags.get(head.integer);
		if (tag.type != LexerType.Integer) {
			head.integer = initialHead;
			throw new DefaultException("Integer not found: " + tag.toString());
		}
		Node node = NodeFactory.getNode(tags, head, ParserType.Terminal);
		children.add(node);
		head.integer++;
	}

	protected void addID(List<Tag> tags, IntWrap head, int initialHead) throws CustomException {
		Tag tag = tags.get(head.integer);
		if (tag.type != LexerType.ID) {
			head.integer = initialHead;
			throw new DefaultException("ID not found: " + tag.toString());
		}
		Node node = NodeFactory.getNode(tags, head, ParserType.Terminal);
		children.add(node);
		head.integer++;
	}

	protected void addTerminal(List<Tag> tags, IntWrap head, int initialHead, String symbol) throws CustomException {
		Tag tag = tags.get(head.integer);
		if (!tag.symbol.equals(symbol)) {
			head.integer = initialHead;
			throw new DefaultException("Bad Symbol: \"" + tag.symbol + "\",  Expected Symbol: \"" + symbol + "\"");
		}
		Node node = NodeFactory.getNode(tags, head, ParserType.Terminal);
		children.add(node);
		head.integer++;
	}
	
	protected void addNonTerminal(List<Tag> tags, IntWrap head, int initialHead, ParserType type) throws CustomException {
		Node node;
		try {
			node = NodeFactory.getNode(tags, head, type);
			children.add(node);
		} catch (CustomException e) {
			head.integer = initialHead;
			throw new DefaultException("Failed to find proper form of " + type.name() + "\n\t" + e.getStackTrace());
		}
	}
	
	protected void setToEpsilon(IntWrap head, int initialHead){
		children.clear();
		children.add(EpsilonNode.getEpsilonNode());
		head.integer = initialHead;
	}

	public Iterator<Node> iterator() {
		return new Iterator<Node>() {
			int childIndex = -1;
			Iterator<Node> childIter;

			@Override
			public boolean hasNext() {
				if (childIndex == -1) {
					return true;
				}
				if (childIndex > children.size() || children.isEmpty()) {
					return false;
				}
				return true;
			}

			@Override
			public Node next() {
				if (childIndex == -1) {
					updateChildIter();
					return Node.this;
				}
				if (childIter.hasNext()) {
					return childIter.next();
				}
				updateChildIter();
				if (childIndex >= children.size()) {
					throw new NoSuchElementException();
				}
				return childIter.next();
			}

			private void updateChildIter() {
				childIndex++;
				if (childIndex < children.size()) {
					childIter = children.get(childIndex).iterator();
				}
			}

		};
	}
}
