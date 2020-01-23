package dataStructures.inter1;

import java.util.List;

public class InterMethod1 implements IInter1 {
	
	private enum ReturnType {
		INT_ARRAY, INT, BOOLEAN, ID, VOID
	}
	
	private ReturnType type;
	private String typeID;
	private String id;
	private List<InterDeclaration1> parameters;
	private List<IInterStatement1> statements;
	
	public InterMethod1(String type, String id, List<InterDeclaration1> parameters,
			List<IInterStatement1> statements) {
		if (type == null || type.equals("void")) {
			this.type = ReturnType.VOID;
		} else if (type.equals("int")) {
			this.type = ReturnType.INT;
		} else if (type.equals("int[]")) {
			this.type = ReturnType.INT_ARRAY;
		} else if (type.equals("boolean")) {
			this.type = ReturnType.BOOLEAN;
		} else {
			this.type = ReturnType.ID;
			this.typeID = type;
		}
		this.id = id;
		this.parameters = parameters;
		this.statements = statements;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Method: {");
		builder.append("type: " + type + ", ");
		if (type == ReturnType.ID) {
			builder.append("typeID: " + typeID + ", ");
		}
		builder.append("id: " + id + ", ");
		builder.append("parameters: " + parameters.toString() + ", ");
		builder.append("statements: " + statements.toString());
		builder.append("}");
		return builder.toString();
	}
	
}
