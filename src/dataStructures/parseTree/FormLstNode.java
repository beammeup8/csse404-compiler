package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;

public class FormLstNode extends Node {
	private boolean isEpsilon;
	private TypeNode type;
	private TerminalNode id;
	private FormLstNode next;

	public FormLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			validateTerminal(tags, head, ",");
			type = new TypeNode(tags, head);
			id = addID(tags, head);
			next = new FormLstNode(tags, head);
			isEpsilon = false;
		} catch (CustomException exception) {
			head.integer = initialHead;
			isEpsilon = true;
		}
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		if (isEpsilon) {
			return "";
		}
		return ", " + type.toString() + " " + id.toString() + " " + next.toString();
	}

}
