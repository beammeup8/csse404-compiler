package dataStructures.parseTree;

import java.util.LinkedList;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import exceptions.CustomException;

public class MethodDeclLstNode extends Node {
	private boolean isEpsilon;
	private MethodDeclNode currentMethod;
	private MethodDeclLstNode furtherMethods;

	public MethodDeclLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			currentMethod = new MethodDeclNode(tags, head);
			furtherMethods = new MethodDeclLstNode(tags, head);
			isEpsilon = false;
		} catch (CustomException e) {
			isEpsilon = true;
			head.integer = initialHead;
		}
	}

	public List<MethodDeclNode> getMethods() {
		if (isEpsilon) {
			return new LinkedList<MethodDeclNode>();
		}
		LinkedList<MethodDeclNode> methods = new LinkedList<>();
		methods.add(currentMethod);
		methods.addAll(furtherMethods.getMethods());
		return methods;
	}

	@Override
	public String toString() {
		return null;
	}

}
