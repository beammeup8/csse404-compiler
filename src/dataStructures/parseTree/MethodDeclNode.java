package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class MethodDeclNode extends Node {

	public MethodDeclNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		addTerminal(tags, head, initialHead , "public");
		addNonTerminal(tags, head, initialHead, ParserType.Decl);
		addTerminal(tags, head, initialHead , "(");
		addNonTerminal(tags, head, initialHead, ParserType.Formal);
		addTerminal(tags, head, initialHead , ")");
		addTerminal(tags, head, initialHead , "{");
		addNonTerminal(tags, head, initialHead, ParserType.StmtLst);
		addTerminal(tags, head, initialHead , "return");
		addNonTerminal(tags, head, initialHead, ParserType.Expr);
		addTerminal(tags, head, initialHead , ";");
		addTerminal(tags, head, initialHead , "}");
	}

	@Override
	public ParserType getType() {
		return ParserType.MethodDecl;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
