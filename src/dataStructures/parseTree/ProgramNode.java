package dataStructures.parseTree;

import java.io.InvalidClassException;
import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class ProgramNode extends Node {
	
	public ProgramNode(List<Tag> tags, IntWrap head) throws Exception {
		Node mainClassDecl = NodeFactory.getNode(tags, head, ParserType.MainClassDecl);
		if(mainClassDecl == null){
			throw new InvalidClassException(tags.toString());
		}
		children.add(mainClassDecl);
		Node classDecl = NodeFactory.getNode(tags, head, ParserType.ClassDecl);
		if(classDecl == null){
			throw new InvalidClassException(tags.toString());
		}
		children.add(classDecl);
		if(head.integer < tags.size()){
			System.err.println("End of File Not Reached");
			//TODO throw error
		}
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

	@Override
	public ParserType getType() {
		return ParserType.Program;
	}

}
