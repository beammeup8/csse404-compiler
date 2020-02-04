package dataStructures.simpleInter;

import java.util.List;

public abstract class Statement {

	public abstract List<Statement> convertToMemAccesses(List<String> localVariables);
	
	protected String getMemLocation(List<String> localVariables, String label){
		int i = localVariables.indexOf(label);
		if(i == -1){
			return label;
		}
		return "DWORD PTR [EBP - " + (4 * (i + 1)) + "]";
	}
}
