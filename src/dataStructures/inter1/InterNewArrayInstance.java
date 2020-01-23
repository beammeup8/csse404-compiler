package dataStructures.inter1;

public class InterNewArrayInstance implements IInterExpression1 {

	private String id;
	private IInterExpression1 length;
	
	public InterNewArrayInstance(IInterExpression1 length) {
		id = IdGenerator.getUniqueId();
		this.length = length;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		length.populateSymbolTable(parent);
		if(!length.getType().equals("int")){
			System.err.println("Arrays must have a numeric length");
			System.exit(0);
		}
		
	}

	@Override
	public String getType() {
		return "int[]";
	}
}
