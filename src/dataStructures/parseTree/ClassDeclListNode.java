package dataStructures.parseTree;

import java.util.LinkedList;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import exceptions.CustomException;

public class ClassDeclListNode extends Node {
	private boolean isEpsilon;
	private ClassDeclNode currentClass;
	private ClassDeclListNode nextClass;

	public ClassDeclListNode(List<Tag> tags, IntWrap head) {
		if (head.integer == tags.size()) {
			isEpsilon = true;
			return;
		}
		int initialHead = head.integer;
		try {
			currentClass = new ClassDeclNode(tags, head);
			nextClass = new ClassDeclListNode(tags, head);
			isEpsilon = false;
		} catch (CustomException e) {
			head.integer = initialHead;
			isEpsilon = true;
		}
	}
	
	public List<ClassDeclNode> getClasses() {
		if(isEpsilon){
			return new LinkedList<>();
		}
		LinkedList<ClassDeclNode> classes = new LinkedList<ClassDeclNode>();
		classes.addFirst(currentClass);
		classes.addAll(nextClass.getClasses());
		return classes;
	}

}
