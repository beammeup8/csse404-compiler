package dataStructures.inter1;

public class InterAssign1 implements IInterStatement1 {
	
	private String id;
	private IInterExpression1 value;

	public InterAssign1(String id, IInterExpression1 value) {
		this.id = id;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Assignment: {id: " + id + ", value: " + value.toString() + "}";
	}

}
