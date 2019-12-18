package dataStructures.parseTree;

import java.io.InvalidClassException;
import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class ProgramNode extends Node {
	
	public ProgramNode(List<Tag> tags, IntWrap head) throws InvalidClassException {
		super(null, ParserType.Program);
		Node mainClassDecl = NodeFactory.getMainClassDecl(tags, head);
		if(mainClassDecl == null){
			throw new InvalidClassException(tags.toString());
		}
		children.add(mainClassDecl);
		Node classDecl = NodeFactory.getClassDecl(tags, head);
		if(classDecl == null){
			throw new InvalidClassException(tags.toString());
		}
		children.add(classDecl);
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
