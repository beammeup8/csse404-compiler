package dataStructures.inter1;

import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Statements;

public interface IInterExpression1 extends IInterStatement1 {
	public String getId();
	public String getType();
	
	public List<Statements> toStatementList();
	
	@Override
	public default Statements toStatement() {
		return new CodeBlock();
	}
}
