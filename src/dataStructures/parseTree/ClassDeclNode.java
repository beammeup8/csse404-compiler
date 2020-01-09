package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

/**
 * ClassDecl -> class ID Extnd { ClassVarDecLst MethodDeclLst } ClassDecl |
 * EPSILON
 * 
 * @author mastermk beemanla
 *
 */
public class ClassDeclNode extends Node {

	public ClassDeclNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		if(head.integer == tags.size()){
			setToEpsilon(head, initialHead);
			return;
		}
		try {
			addTerminal(tags, head, initialHead, "class");
			addID(tags, head, initialHead);
			addNonTerminal(tags, head, initialHead, ParserType.Extnd);
			addTerminal(tags, head, initialHead, "{");
			addNonTerminal(tags, head, initialHead, ParserType.ClassVarDeclLst);
			addNonTerminal(tags, head, initialHead, ParserType.MethodDeclLst);
			addTerminal(tags, head, initialHead, "}");
			addNonTerminal(tags, head, initialHead, ParserType.ClassDecl);
		} catch (CustomException e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

	@Override
	public ParserType getType() {
		return ParserType.ClassDecl;
	}

}
