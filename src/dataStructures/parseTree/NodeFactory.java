package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class NodeFactory {

	public static Node getNode(List<Tag> tags, IntWrap head, ParserType type) throws Exception {
		switch (type) {
		case Program:
			return new ProgramNode(tags, head);
		case MainClassDecl:
			return new MainClassDeclNode(tags, head);
		case ClassDecl:
			return new ClassDeclNode(tags, head);
		default:
			break;
		}
		return null;
	}
}
