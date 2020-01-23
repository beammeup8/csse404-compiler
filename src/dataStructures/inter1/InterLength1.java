package dataStructures.inter1;

public class InterLength1 implements IInterExpression1 {

	private String id;

	public InterLength1(IInterExpression1 arrayExpression) {
		id = IdGenerator.getUniqueId();
	}
	
	@Override
	public String getId() {
		return id;
	}

}
