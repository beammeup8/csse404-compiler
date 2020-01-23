package dataStructures.inter1;

public class InterDeclaration1 implements IInterStatement1 {
	private String typeID;
	private String id;

	public InterDeclaration1(String type, String id) {
		this.typeID = type;
		this.id = id;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Declaration: {");
		builder.append("typeID: " + typeID + ", ");
		builder.append("id: " + id + "}");
		return builder.toString();
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		parent.addEntry(id, typeID);
	}

}
