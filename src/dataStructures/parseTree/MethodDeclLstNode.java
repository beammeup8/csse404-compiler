package dataStructures.parseTree;

import java.util.LinkedList;
import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

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

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

	public List<MethodDeclNode> getMethods() {
		if(isEpsilon){
			return new LinkedList<MethodDeclNode>();
		}
		LinkedList<MethodDeclNode> methods = new LinkedList<>();
		methods.add(currentMethod);
		methods.addAll(furtherMethods.getMethods());
		return methods;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return null;
	}

}
