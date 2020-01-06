package parser;

import dataStructures.parseTree.Node;
import dataStructures.parseTree.NodeFactory;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class Parser {
	public Node parse(List<Tag> tags){
		try {
			return NodeFactory.getNode(tags, new IntWrap(), ParserType.Program);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}
}
