package dataStructures.inter1;

public class InterLength1 implements IInterExpression1 {

	private String id;
	private IInterExpression1 arrayExpression;

	public InterLength1(IInterExpression1 arrayExpression) {
		id = IdGenerator.getUniqueId();
		this.arrayExpression = arrayExpression;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		arrayExpression.populateSymbolTable(parent);
		System.out.println(arrayExpression.getType());
		if (!arrayExpression.getType().equals("int[]")) {
			System.err.println("Can not take the length of a non-array object");
			System.exit(0);
		}
	}

	@Override
	public String getType() {
		return "int";
	}

}
