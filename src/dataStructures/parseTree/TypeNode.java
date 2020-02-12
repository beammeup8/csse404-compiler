package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import exceptions.CustomException;

public class TypeNode extends Node {
	private TerminalNode type;

	public TypeNode(List<Tag> tags, IntWrap head) throws CustomException {
		if (tags.get(head.integer).symbol.equals("boolean")) {
			type = addTerminal(tags, head, "boolean");
		} else if (tags.get(head.integer).symbol.equals("int")) {
			type = addTerminal(tags, head, "int");
			if (tags.get(head.integer).symbol.equals("[")) {
				validateTerminal(tags, head, "[");
				validateTerminal(tags, head, "]");
				type.symbol += "[]";
			}
		} else {
			type = addID(tags, head);
		}
	}

	@Override
	public String toString() {
		return type.toString();
	}

	public String getType() {
		return this.type.symbol;
	}

}
