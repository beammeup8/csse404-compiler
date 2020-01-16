package dataStructures.inter1;

import java.util.List;

public class InterClass1 implements IInter1 {

	private String className;
	private boolean isMain;
	private String superClass;
	private List<InterDeclaration1> fields;
	private List<InterMethod1> methods;

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
	
}
