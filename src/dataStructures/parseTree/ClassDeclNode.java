package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;

/**
 * 
 * @author mastermk beemanla
 *
 */
public class ClassDeclNode extends Node {
	private TerminalNode className;
	private ExtendNode extension;
	private List<ClassVarDeclNode> classVars;
	private List<MethodDeclNode> methods;

	public ClassDeclNode(List<Tag> tags, IntWrap head) throws CustomException {
		validateTerminal(tags, head, "class");
		className = addID(tags, head);
		extension = new ExtendNode(tags, head);
		validateTerminal(tags, head, "{");
		classVars = new ClassVarDeclLstNode(tags, head).getClassVars();
		methods = new MethodDeclLstNode(tags, head).getMethods();
		validateTerminal(tags, head, "}");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(Class Declaration: class ");
		builder.append(className.toString());
		builder.append(extension.toString());
		builder.append("{");
		builder.append(classVars.toString());
		builder.append(methods.toString());
		builder.append(")");
		return builder.toString();
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

}
