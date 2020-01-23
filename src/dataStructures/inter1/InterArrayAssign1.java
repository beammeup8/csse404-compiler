package dataStructures.inter1;


public class InterArrayAssign1 implements IInterStatement1 {
	private String arrayID;
	IInterExpression1 arrayIndex, value;

	public InterArrayAssign1(String arrayID, IInterExpression1 arrayIndex, IInterExpression1 value) {
		this.arrayID = arrayID;
		this.arrayIndex = arrayIndex;
		this.value = value;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		parent.checkType(arrayID, "int[]");		
		arrayID = parent.getLocalName(arrayID);
	}

}
