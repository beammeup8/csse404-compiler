package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

public class Compare extends Statement{
	public String labelA, labelB;
	
	@Override
	public String toString() {
		return toX86();
	}
	
	public String toX86(){
		return "\tcmp " + labelA + ", " + labelB;
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		String aMemLocation = getMemLocation(localVariables, labelA);
		String bMemLocation = getMemLocation(localVariables, labelB);
		if(aMemLocation.equals(labelA) || bMemLocation.equals(labelB)){
			labelA = aMemLocation;
			labelB = bMemLocation;
			return Arrays.asList(this);
		}
		Assignment getInFromMem = new Assignment(aMemLocation, "EBX");
		labelA = aMemLocation;
		labelB = bMemLocation;
		return Arrays.asList(getInFromMem, this);
	}
}
