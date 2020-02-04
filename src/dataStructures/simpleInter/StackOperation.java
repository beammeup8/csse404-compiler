package dataStructures.simpleInter;

public class StackOperation implements Statement {
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

}
