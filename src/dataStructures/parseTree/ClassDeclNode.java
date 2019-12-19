package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class ClassDeclNode extends Node {

	public ClassDeclNode(List<Tag> tags, IntWrap head) {
		super(null, ParserType.ClassDecl);
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
