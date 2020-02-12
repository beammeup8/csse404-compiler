package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.InterClass1;
import dataStructures.inter1.InterDeclaration1;
import dataStructures.inter1.InterMethod1;
import exceptions.CustomException;

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

	public InterClass1 convertToInter1() {
		List<InterDeclaration1> declarations = new ArrayList<>();
		classVars.forEach(x -> declarations.add(x.convertToInter1()));
		List<InterMethod1> interMethods = new ArrayList<>();
		methods.forEach(x -> interMethods.add(x.convertToInter1()));
		return new InterClass1(className.symbol, false, extension.getSuper(), declarations, interMethods);
	}

}
