package dataStructures.inter1;

public class InterNewClassInstance implements IInterExpression1 {

	private String id;
	
	public InterNewClassInstance(String id) {
		id = IdGenerator.getUniqueId();
	}
	
	@Override
	public String getId() {
		return id;
	}

}
