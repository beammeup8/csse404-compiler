package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

/**
 * Expr ->	Comp LogicExpr
 * @author mastermk beemanla
 *
 */
public class ExprNode extends Node {

	public ExprNode(List<Tag> tags, IntWrap head) throws CustomException {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead, ParserType.Comp);
		addNonTerminal(tags, head, initialHead, ParserType.LogicExpr);
	}

	@Override
	public ParserType getType() {
		return ParserType.Expr;
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

}
