package dataStructures.simpleInter;

public class Operation implements Statements {
	public String labelA, labelB, labelOut;
	public OpType op;
	
	@Override
	public String toString() {
		return "\t" + labelOut + " = (" + labelA + " " + op.toString() + " " + labelB + ")";
	}
}
