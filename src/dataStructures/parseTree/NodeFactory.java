package dataStructures.parseTree;

import java.util.List;

import dataStructures.Tag;

public class NodeFactory {

	public static Node getProgramNode(List<Tag> tags, IntWrap head) throws Exception {
		return new ProgramNode(tags, head);
	}
	
	public static Node getMainClassDecl(List<Tag> tags, IntWrap head){
		return new MainClassDeclNode(tags, head);
	}
	
	public static Node getClassDecl(List<Tag> tags, IntWrap head){
		return new ClassDeclNode(tags, head);
	}

}