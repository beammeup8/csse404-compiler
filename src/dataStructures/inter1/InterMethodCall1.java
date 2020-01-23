package dataStructures.inter1;

import java.util.List;

public class InterMethodCall1 implements IInterExpression1 {

	private String id;

	public InterMethodCall1(IInterExpression1 calledOn, String id, List<IInterExpression1> parameters) {
		id = IdGenerator.getUniqueId();
	}
	
	@Override
	public String toString() {
		return "Method Call: {toPrint:}";
	}
	
	@Override
	public String getId() {
		return id;
	}

}
