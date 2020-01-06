package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

public class TypeNode extends Node {

	public TypeNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		if (tags.get(head.integer).symbol.equals("boolean")) {
			addTerminal(tags, head, initialHead, "boolean");
		} else if (tags.get(head.integer).symbol.equals("int")) {
			addTerminal(tags, head, initialHead, "int");
			if (tags.get(head.integer).symbol.equals("[")) {
				addTerminal(tags, head, initialHead, "[");
				addTerminal(tags, head, initialHead, "]");
			}
		} else {
			addID(tags, head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.Type;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
