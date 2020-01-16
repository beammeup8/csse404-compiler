package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.InterClass1;
import dataStructures.inter1.InterProgram1;

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
	public void optimize() {
		// TODO Auto-generated method stub
		
	}
	
	public InterProgram1 convertToInter1() {
		List<InterClass1> classes = new ArrayList<>();
		classes.add(mainClass.convertToInter1());
		otherClasses.forEach(x -> classes.add(x.convertToInter1()));
		return new InterProgram1(classes);
	}

}
