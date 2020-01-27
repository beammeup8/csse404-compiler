package dataStructures.inter1;

import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Label;
import dataStructures.simpleInter.Statements;

public class InterClass1 implements IInter1 {

	private String className;
	private boolean isMain;
	private String superClass;
	private List<InterDeclaration1> fields;
	private List<InterMethod1> methods;
	private SymbolTable table;

	public InterClass1(String className, boolean isMain, String superClass, List<InterDeclaration1> fields,
			List<InterMethod1> methods) {
		this.className = className;
		this.isMain = isMain;
		this.superClass = superClass;
		this.fields = fields;
		this.methods = methods;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Class: {");
		builder.append("className: " + className + ", ");
		builder.append("isMain: " + isMain + ", ");
		builder.append("superClass: " + superClass + ", ");
		builder.append("fields: " + fields.toString() + ", ");
		builder.append("methods: " + methods.toString());
		builder.append("}\n");
		return builder.toString();
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		table.addEntry("this", className);
		methods.forEach(x -> x.populateSymbolTable(table));
	}

	public void addMethodsToSymbolTable(SymbolTable table) {
		methods.forEach(x -> table.addEntry(className + "." + x.getName(), x.getType()));
	}

	public String getClassName() {
		return className;
	}

	public String getSuperClassName() {
		return superClass;
	}
	
	public SymbolTable getTable() {
		return table;
	}
	
	public List<InterDeclaration1> getFields() {
		return fields;
	}
	
	public List<InterMethod1> getMethods() {
		return methods;
	}
	
	public SymbolTable prepareSymbolTable(SymbolTable parent) {
		table = new SymbolTable(parent);
		addMethodsToSymbolTable(table);
		fields.forEach(x -> x.populateSymbolTable(table));
		return table;
	}

	public Statements toCodeBlock() {
		CodeBlock classCodeBlock = new CodeBlock();
		if(isMain){
			Label mainLabel = new Label();
			mainLabel.label = "_MAIN";
			classCodeBlock.statements.add(mainLabel);
			classCodeBlock.statements.add(methods.get(0).toCodeBlock());
			return classCodeBlock;
		}
		methods.forEach(x -> classCodeBlock.statements.add(x.toCodeBlock()));
		return classCodeBlock;
	}

}
