package dataStructures.simpleInter;

import java.util.List;
import java.util.Map;

import dataStructures.x86.Command;

public abstract class Statement {

	public abstract String localVariableAssigned();
	
	public abstract List<Statement> convertToMemAccesses(List<String> localVariables);

	protected String getMemLocation(List<String> localVariables, String label) {
		int i = localVariables.indexOf(label);
		if (i == -1) {
			return label;
		}
		return "DWORD PTR [EBP - " + (4 * (i + 1)) + "]";
	}

	public abstract Command toX86();
	
	protected String getNewVarName(String toReplace, Map<String, String> varMap)  {
		String toReturn = toReplace;
		boolean hasChanged = true;
		while (hasChanged) {
			hasChanged = false;
			String replacementName = varMap.get(toReturn);
			if (replacementName != null) {
				toReturn = replacementName;
				hasChanged = true;
			}
		}
		return toReturn;
	}
}
