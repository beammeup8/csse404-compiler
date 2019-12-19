package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

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
		} catch (Exception exception) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.Extnd;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
