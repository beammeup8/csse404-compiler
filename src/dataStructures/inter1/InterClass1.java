package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Function;

public class InterClass1 implements IInter1 {

	private String className;
	private boolean isMain;
	private String superClass;
	private List<InterDeclaration1> fields;
	private List<InterMethod1> methods;
	private SymbolTable table;
	private Map<String, InterClass1> classMap;

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
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		this.classMap = classMap;
		table.addEntry("this", className);
		methods.forEach(x -> x.populateSymbolTable(table, classMap));
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
		List<InterDeclaration1> toReturn = new ArrayList<InterDeclaration1>();
		if (superClass != null) {
			InterClass1 superClassObj = classMap.get(superClass);
			toReturn = superClassObj.getFields();
		}
		toReturn.addAll(fields);
		return toReturn;
	}

	public List<InterMethod1> getMethods() {
		return methods;
	}

	public SymbolTable prepareSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		table = new SymbolTable(parent);
		for (int i = 0; i < fields.size(); i++) {
			fields.get(i).populateSymbolTable(table, classMap, 4 * i);
		}
		return table;
	}

	public List<Function> toCodeBlock() {
		List<Function> block = new ArrayList<>();
		if (isMain) {
			block.add(methods.get(0).toFunction("_MAIN"));
			return block;
		}
		methods.forEach(x -> {
			String name = table.getLocalName(className + "." + x.getName());
			block.add(x.toFunction(name));
		});
		return block;
	}

}
