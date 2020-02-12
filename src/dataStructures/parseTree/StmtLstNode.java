package dataStructures.parseTree;

import java.util.LinkedList;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import exceptions.CustomException;

/**
 * StmtLst -> Stmt StmtLst | EPSILON
 * 
 * @author mastermk beemanla
 *
 */
public class StmtLstNode extends Node {
	private boolean isEpsilon;
	private StmtNode currentStatment;
	private StmtLstNode furtherStatements;

	public StmtLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			currentStatment = new StmtNode(tags, head);
			furtherStatements = new StmtLstNode(tags, head);
			isEpsilon = false;
		} catch (CustomException e) {
			head.integer = initialHead;
			isEpsilon = true;
		}
	}
	
	public List<StmtNode> getStatements(){
		if(isEpsilon){
			return new LinkedList<>();
		}
		LinkedList<StmtNode> statements = new LinkedList<StmtNode>();
		statements.addFirst(currentStatment);
		statements.addAll(furtherStatements.getStatements());
		return statements;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

}
