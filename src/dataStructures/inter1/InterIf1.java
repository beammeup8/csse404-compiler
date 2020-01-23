package dataStructures.inter1;

public class InterIf1 implements IInterStatement1 {

	private IInterExpression1 expression;
	private IInterStatement1 thenStatement;
	private IInterStatement1 elseStatement;
	
	public InterIf1(IInterExpression1 expression, IInterStatement1 thenStatement, IInterStatement1 elseStatement) {
		this.expression = expression;
		this.thenStatement = thenStatement;
		this.elseStatement = elseStatement;
	}
	
	@Override
	public String toString() {
		return "If: {expression: " + expression.toString() + ", then: " + thenStatement.toString() + ", else: " + elseStatement.toString() + "}";
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		expression.populateSymbolTable(parent);
		thenStatement.populateSymbolTable(new SymbolTable(parent));
		elseStatement.populateSymbolTable(new SymbolTable(parent));
	}
	
}
