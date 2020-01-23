package dataStructures.inter1;

public class InterNewArrayInstance implements IInterExpression1 {

	private String id;

	public InterNewArrayInstance(IInterExpression1 length) {
		id = IdGenerator.getUniqueId();
	}

	@Override
	public String getId() {
		return id;
	}
}
