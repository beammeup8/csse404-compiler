package dataStructures.parseTree;

import java.util.LinkedList;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import exceptions.CustomException;

public class ClassVarDeclLstNode extends Node {
	private boolean isEpsilon;
	private ClassVarDeclNode classVar;
	private ClassVarDeclLstNode furtherClassVars;

	public ClassVarDeclLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			classVar = new ClassVarDeclNode(tags, head);
			furtherClassVars = new ClassVarDeclLstNode(tags, head);
			isEpsilon = false;
		} catch (CustomException e) {
			head.integer = initialHead;
			isEpsilon = true;
		}
	}

	public List<ClassVarDeclNode> getClassVars() {
		if (isEpsilon) {
			return new LinkedList<>();
		}
		LinkedList<ClassVarDeclNode> classVars = new LinkedList<>();
		classVars.add(classVar);
		classVars.addAll(furtherClassVars.getClassVars());
		return classVars;
	}

}
