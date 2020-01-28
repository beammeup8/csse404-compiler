package dataStructures.simpleInter;

public class Assignment implements Statement{
	public String labelIn, labelOut;
	
	public Assignment(String labelIn, String labelOut) {
		this.labelIn = labelIn;
		this.labelOut = labelOut;
	}

	@Override
	public String toString() {
		return "\t" + labelOut + " = " + labelIn;
	}
}
