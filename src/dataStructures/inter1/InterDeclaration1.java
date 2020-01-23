package dataStructures.inter1;

public class InterDeclaration1 implements IInterStatement1 {
	
	private enum DeclarationType {
		INT_ARRAY, INT, BOOLEAN, ID
	}
	
	private DeclarationType type;
	private String typeID;
	private String id;
	
	public InterDeclaration1(String type, String id) {
		if (type.equals("int")) {
			this.type = DeclarationType.INT;
		} else if (type.equals("int[]")) {
			this.type = DeclarationType.INT_ARRAY;
		} else if (type.equals("boolean")) {
			this.type = DeclarationType.BOOLEAN;
		} else {
			this.type = DeclarationType.ID;
			this.typeID = type;
		}
		this.id = id;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Declaration: {");
		builder.append("type: " + type + ", ");
		if (type == DeclarationType.ID) {
			builder.append("typeID: " + typeID + ", ");
		}
		builder.append("id: " + id + "}");
		return builder.toString();
	}

}
