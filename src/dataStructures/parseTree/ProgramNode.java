package dataStructures.parseTree;

import java.io.InvalidClassException;
import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;
import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

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
			throw new SyntaxException("End of File not Reached");
		}
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
