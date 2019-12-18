package parser;

import dataStructures.parseTree.IntWrap;
import dataStructures.parseTree.Node;
import dataStructures.parseTree.NodeFactory;

import java.util.List;

import dataStructures.Tag;

public class Parser {
	public Node parse(List<Tag> tags){
		try {
			return NodeFactory.getProgramNode(tags, new IntWrap());
		} catch (Exception e) {
			System.exit(0);
		}
		return null;
	}
}
