package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

/**
 * Program -> MainClassDecl ClassDecl
 * 
 * @author mastermk beemanla
 *
 */
public class ProgramNode extends Node {
	private MainClassDeclNode mainClass;
	private List<ClassDeclNode> otherClasses;

	public ProgramNode(List<Tag> tags, IntWrap head) {
		try {
			mainClass = new MainClassDeclNode(tags, head);
			otherClasses = new ClassDeclListNode(tags, head).getClasses();
			if (head.integer < tags.size()) {
				System.err.println("End of File Not Reached\n" + "Remaining tags are: "
						+ tags.subList(head.integer, tags.size()).toString());
			}
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Override
	public String toString() {
		return "( Program: " + mainClass.toString() + " " +  otherClasses.toString() + " )";
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

}
