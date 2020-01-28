package dataStructures.simpleInter;

public class Operation implements Statement {
	public String labelA, labelB, labelOut;
	public OpType op;
	
	public Operation(String labelA, String labelB, String labelOut, OpType op) {
		this.labelA = labelA;
		this.labelB = labelB;
		this.labelOut = labelOut;
		this.op = op;
	}

	@Override
	public String toString() {
		return "\t" + labelOut + " = (" + labelA + " " + op.toString() + " " + labelB + ")";
	}
}
