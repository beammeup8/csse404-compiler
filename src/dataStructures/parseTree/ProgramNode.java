package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.ParserType;
import dataStructures.Tag;

/**
 * Program -> MainClassDecl ClassDecl
 * 
 * @author mastermk beemanla
 *
 */
public class ProgramNode extends Node {

	public ProgramNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			addNonTerminal(tags, head, initialHead, ParserType.MainClassDecl);
			addNonTerminal(tags, head, initialHead, ParserType.ClassDecl);
			if (head.integer < tags.size()) {
				System.err.println("End of File Not Reached\n" + "Remaining tags are: "
						+ tags.subList(head.integer, tags.size()).toString());
			}
		} catch (CustomException e) {
			System.err.println(e.getMessage());
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
