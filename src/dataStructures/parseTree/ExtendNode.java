package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

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
	public AbstractStructure convertToInternal() {
		return null;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		if(isEpsilon){
			return "";
		}
		return " extends " + superClass.toString();
	}

}
