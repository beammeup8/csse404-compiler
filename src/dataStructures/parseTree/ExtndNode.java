package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

/**
 * Extnd -> extends ID | EPSILON
 * 
 * @author mastermk beemanla
 *
 */
public class ExtndNode extends Node {

	public ExtndNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addTerminal(tags, head, initialHead, "extends");
			addID(tags, head, initialHead);
		} catch (CustomException exception) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.Extnd;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
