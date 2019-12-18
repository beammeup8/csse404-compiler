package parser;

import dataStructures.parseTree.IntWrap;
import dataStructures.parseTree.Node;
import dataStructures.parseTree.NodeFactory;

import java.io.InvalidClassException;
import java.util.List;

import dataStructures.Tag;

public class Parser {
	public Node parse(List<Tag> tags){
		try {
			return NodeFactory.getProgramNode(tags, new IntWrap());
		} catch (InvalidClassException e) {
			System.exit(0);
		}
		return null;
	}
}
