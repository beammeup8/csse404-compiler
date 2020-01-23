package dataStructures.inter1;

import java.util.List;

public class InterMethodCall1 implements IInterExpression1 {

	private String id, methodId;
	private IInterExpression1 calledOn;
	private List<IInterExpression1> parameters;
	private SymbolTable table;

	public InterMethodCall1(IInterExpression1 calledOn, String methodId, List<IInterExpression1> parameters) {
		id = IdGenerator.getUniqueId();
		this.calledOn = calledOn;
		this.methodId = methodId;
		this.parameters = parameters;
	}
	
	@Override
	public String toString() {
		return "Method Call: {toPrint:}";
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		table = parent;
		calledOn.populateSymbolTable(parent);
		parameters.forEach(x -> x.populateSymbolTable(parent));
	}

	@Override
	public String getType() {
		return table.getType(calledOn.getType() + "." + methodId);
	}

}
