package dataStructures.inter1;

import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Statement;

public interface IInterExpression1 extends IInterStatement1 {
	public String getId();
	public String getType();
	
	public List<Statement> toStatementList();
	
	@Override
	public default Statement toStatement() {
		return new CodeBlock();
	}
}
