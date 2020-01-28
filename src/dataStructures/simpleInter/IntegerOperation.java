package dataStructures.simpleInter;

public class IntegerOperation implements Statement {
	public String labelA, labelOut;
	public int b;
	public OpType op;
	
	public IntegerOperation(String labelA, int b, String labelOut, OpType op) {
		this.labelA = labelA;
		this.b = b;
		this.labelOut = labelOut;
		this.op = op;
	}

	@Override
	public String toString() {
		return "\t" + labelOut + " = (" + labelA + " " + op.toString() + " " + b + ")";
	}
}
