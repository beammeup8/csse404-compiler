package dataStructures.inter1;

public class InterNewClassInstance implements IInterExpression1 {

	private String id, className;
	
	public InterNewClassInstance(String className) {
		id = IdGenerator.getUniqueId();
		this.className = className;
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		//TODO check class name later
	}

	@Override
	public String getType() {
		return className;
	}

}
