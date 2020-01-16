package parser;

import dataStructures.parseTree.Node;
import dataStructures.parseTree.ProgramNode;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;

public class Parser {
	public Node parse(List<Tag> tags){
		try {
			return new ProgramNode(tags, new IntWrap());
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}
}
