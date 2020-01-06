package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

/**
 * StmtLst -> Stmt StmtLst | EPSILON
 * 
 * @author mastermk beemanla
 *
 */
public class StmtLstNode extends Node {

	public StmtLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addNonTerminal(tags, head, initialHead, ParserType.Stmt);
			addNonTerminal(tags, head, initialHead, ParserType.StmtLst);
		} catch (CustomException e) {
			setToEpsilon(head, initialHead);
		}
	}

	@Override
	public ParserType getType() {
		return ParserType.StmtLst;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub.

	}

}
