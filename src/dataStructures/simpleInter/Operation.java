package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

public class Operation extends Statement {
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

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		String aMem = getMemLocation(localVariables, labelA);
		String bMem = getMemLocation(localVariables, labelB);
		String outMem = getMemLocation(localVariables, labelOut);
		List<Statement> toReturn = new ArrayList<>();
		if(!aMem.equals(labelA)){
			toReturn.add(new Assignment(aMem, "EBX"));
			labelA = "EBX";
		}
		if(!bMem.equals(labelB)){
			toReturn.add(new Assignment(bMem, "ECX"));
			labelB = "ECX";
		}
		toReturn.add(this);
		toReturn.add(new Assignment("EBX", outMem));
		return toReturn;
	}
}
