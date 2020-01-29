package dataStructures.inter1;

import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Allocation;
import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Statement;

public class InterNewClassInstance implements IInterExpression1 {

	private String id, className;
	private Map<String, InterClass1> classMap;

	public InterNewClassInstance(String className) {
		id = IdGenerator.getUniqueId();
		this.className = className;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		this.classMap = classMap;
	}

	@Override
	public String getType() {
		return className;
	}

	@Override
	public Statement toStatement() {
		CodeBlock block = new CodeBlock();
		List<InterDeclaration1> fields = classMap.get(className).getFields();
		int sizeOfObj = fields.size() * 4;
		block.add(new Allocation(id, "{" + sizeOfObj + "}"));
		return block;
	}

	@Override
	public List<Statement> toStatementList() {
		return ((CodeBlock) toStatement()).statements;
	}

}
