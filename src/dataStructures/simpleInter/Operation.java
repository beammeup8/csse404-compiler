package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Operation extends Statement {
	private String labelA, labelB, labelOut;
	private OpType op;
	
	private Set<OpType> comparisons = EnumSet.of(OpType.EQ, OpType.NEQ, OpType.LSE, OpType.LST, OpType.GRT, OpType.GRE);
	
	public Operation(String labelA, String labelB, String labelOut, OpType op) {
		this.labelA = labelA;
		this.labelB = labelB;
		this.labelOut = labelOut;
		this.op = op;
	}

	@Override
	public String toString() {
		String opName;
		switch (op) {
		case ADD:
			return twoParamToString("add");
		case AND:
			return twoParamToString("and");
		case MULT:
			return twoParamToString("imul");
		case OR:
			return twoParamToString("or");
		case SUB:
			return twoParamToString("sub");
		case DIV:
			return oneParamToString("idiv");
		case NEG:
			return oneParamToString("neg");
		case NOT:
			return oneParamToString("not");
		case EQ:
			return setConditionalToString("e");
		case GRE:
			return setConditionalToString("ge");
		case GRT:
			return setConditionalToString("g");
		case LSE:
			return setConditionalToString("le");
		case LST:
			return setConditionalToString("l");
		case NEQ:
			return setConditionalToString("ne");
		default:
			return null;
		}
	}
	
	private String setConditionalToString(String op) {
		return "\tset" + op + " AL";
	}

	private String oneParamToString(String op) {
		return "\t" + op + " " + labelOut;
	}
	
	private String twoParamToString(String op) {
		return "\t" + op + " " + labelA + ", " + labelB;
	}
	
	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		String aMem = getMemLocation(localVariables, labelA);
		String bMem = getMemLocation(localVariables, labelB);
		String outMem = getMemLocation(localVariables, labelOut);
		List<Statement> toReturn = new ArrayList<>();
		if (op == OpType.DIV) {
			toReturn.add(new Assignment("" + 0, "EDX"));
		}
		if(aMem != null && !aMem.equals(labelA)){
			labelA = "EAX";
			toReturn.add(new Assignment(aMem, labelA));
		}
		if(bMem != null && !bMem.equals(labelB)){
			labelB = "EBX";
			toReturn.add(new Assignment(bMem, labelB));
		}
		if (comparisons.contains(op)) {
			toReturn.add(new Compare(labelA, labelB));
		}
		toReturn.add(this);
		if(outMem != null && !outMem.equals(labelOut)){
			labelOut = "EAX";
			toReturn.add(new Assignment(labelOut, outMem));
		}
		return toReturn;
	}

	@Override
	public String localVariableAssigned() {
		return labelOut;
	}
}
