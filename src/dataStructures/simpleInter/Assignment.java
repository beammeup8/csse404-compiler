package dataStructures.simpleInter;

public class Assignment implements Statements{
	public String labelIn, labelOut;
	public long memoryLocation;
	
	@Override
	public String toString() {
		return "\t" + labelOut + " = " + labelIn;
	}
}
