package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.InterDeclaration1;
import exceptions.CustomException;

public class FormalNode extends Node {
	private boolean isEpsilon;
	private TypeNode type;
	private TerminalNode id;
	private FormLstNode next;

	public FormalNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
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
	public String toString() {
		if (isEpsilon) {
			return "";
		}
		return type.toString() + " " + id.toString() + " " + next.toString();
	}

	public List<InterDeclaration1> convertToInter1() {
		List<InterDeclaration1> declarations = new ArrayList<>();
		if (!isEpsilon) {
			declarations.add(new InterDeclaration1(type.getType(), id.symbol));
			declarations.addAll(next.convertToInter1());
		}
		return declarations;
	}

}
