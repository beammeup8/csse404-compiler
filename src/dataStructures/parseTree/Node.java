package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

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

	protected void addID(List<Tag> tags, IntWrap head, int initialHead) throws Exception {
		Tag tag = tags.get(head.integer);
		if (tag.type != LexerType.ID) {
			head.integer = initialHead;
			throw new Exception();
		}
		Node node = new TerminalNode(tag);
		children.add(node);
		head.integer++;
	}

	protected void addTerminal(List<Tag> tags, IntWrap head, int initialHead, String symbol) throws Exception {
		Tag tag = tags.get(head.integer);
		if (!tag.symbol.equals(symbol)) {
			head.integer = initialHead;
			throw new Exception();
		}
		Node node = new TerminalNode(tag);
		children.add(node);
		head.integer++;
	}
	
	protected void addNonTerminal(List<Tag> tags, IntWrap head, int initialHead, ParserType type) throws Exception {
		Node node = NodeFactory.getNode(tags, head, type);
		if(node == null){
			head.integer = initialHead;
			throw new Exception(tags.toString());
		}
		children.add(node);
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
