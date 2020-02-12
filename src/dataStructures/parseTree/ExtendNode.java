package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import exceptions.CustomException;

/**
 * Extnd -> extends ID | EPSILON
 * 
 * @author mastermk beemanla
 *
 */
public class ExtendNode extends Node {
	private boolean isEpsilon;
	private TerminalNode superClass;

	public ExtendNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			validateTerminal(tags, head, "extends");
			superClass = addID(tags, head);
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
		return " extends " + superClass.toString();
	}

	public String getSuper() {
		if (isEpsilon) {
			return null;
		}
		return superClass.symbol;
	}

}
