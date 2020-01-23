package dataStructures.inter1;

import dataStructures.TermType;

public class InterValueExpression1 implements IInterExpression1 {

	private String id;

	public InterValueExpression1(TermType type) {
		this(type, null);
	}

	public InterValueExpression1(TermType type, String symbol) {
		id = IdGenerator.getUniqueId();
	}
	
	@Override
	public String getId() {
		return id;
	}

}
