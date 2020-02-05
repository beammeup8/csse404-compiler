package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

public class StackOperation extends Statement {
	private String label;
	private StackOpType opType;

	public StackOperation(StackOpType opType) {
		this.opType = opType;
	}
	
	public StackOperation(String label, StackOpType opType) {
		this.label = label;
		this.opType = opType;
	}

	@Override
	public String toString() {
		switch (opType) {
		case POP:
			return "\tpop " + label;
		case POPAD:
			return "\tpopad";
		case PUSH:
			return "\tpush " + label;
		case PUSHAD:
			return "\tpushad";
		}
		return null;
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		if(label != null){
			label = getMemLocation(localVariables, label);
		}
		return Arrays.asList(this);
	}

	@Override
	public String localVariableAssigned() {
		return label;
	}

}
