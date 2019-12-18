package dataStructures.parseTree;

import java.io.InvalidClassException;
import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class ProgramNode extends Node {
	
	public ProgramNode(List<Tag> tags, IntWrap head) throws Exception {
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
		if(head.integer < tags.size()){
			System.err.println("End of File Not Reached");
			//TODO throw error
		}
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
