package parser;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.parseTree.ProgramNode;

public class Parser {
	public ProgramNode parse(List<Tag> tags){
		try {
			return new ProgramNode(tags, new IntWrap());
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}
}
