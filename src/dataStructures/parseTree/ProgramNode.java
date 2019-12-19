package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

/**
 * Program -> MainClassDecl ClassDecl
 * 
 * @author mastermk beemanla
 *
 */
public class ProgramNode extends Node {
	
	public ProgramNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		addNonTerminal(tags, head, initialHead, ParserType.MainClassDecl);
		addNonTerminal(tags, head, initialHead, ParserType.ClassDecl);
		if(head.integer < tags.size()){
			System.err.println("End of File Not Reached");
			//TODO throw error
		}
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

	@Override
	public ParserType getType() {
		return ParserType.Program;
	}

}
