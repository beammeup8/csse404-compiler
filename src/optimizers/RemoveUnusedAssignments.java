package optimizers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;
import dataStructures.x86.FunctionX86;

public class RemoveUnusedAssignments extends Optimizer {

	@Override
	protected int optimizeFunction(FunctionX86 func) {
		Set<String> hasBeenUsed = new HashSet<String>();
		hasBeenUsed.add("EAX");
		hasBeenUsed.add("EBP");
		hasBeenUsed.add("ESP");
		hasBeenUsed.add("DWORD PTR [ESP]");
		hasBeenUsed.add("DWORD PTR [ESP+4]");
		for (Command a1 : func.commands) {
			if (a1.param1 != null) {
				if (a1.type != CommandType.MOV) {
					hasBeenUsed.add(a1.param1);
				}
				hasBeenUsed.addAll(getAllRegUsed(a1.param1));
			}
			if (a1.param2 != null) {
				hasBeenUsed.add(a1.param2);
				hasBeenUsed.addAll(getAllRegUsed(a1.param2));
			}
		}
		
		int changes = 0;
		for (int i = func.commands.size() - 1; i >= 0; i--) {
			Command a1 = func.commands.get(i);
			if (a1.type == CommandType.MOV) {
				if (!hasBeenUsed.contains(a1.param1) && isEBPMemAddr(a1.param1)) {
					func.commands.remove(a1);
					changes++;
				}
			}

		}
		return changes;
	}
	
	private boolean isEBPMemAddr(String param){
		List<String> temp = getAllRegUsed(param);
		temp.remove("EBP");
		return temp.size() == 0;
	}

	private List<String> getAllRegUsed(String param) {
		if (!param.startsWith("DWORD")) {
			return new ArrayList<String>();
		}
		String strippedDown = param.substring(11, param.length() - 1);
		String[] pieces = strippedDown.split("[\\+-]");
		List<String> toReturn = new ArrayList<>();
		pieces[0] = pieces[0].trim();

		if (pieces[0].equals("EBX") || pieces[0].equals("ECX") || pieces[0].equals("EDX") || pieces[0].equals("ESI")
				|| pieces[0].equals("EDI")) {
			toReturn.add(pieces[0]);
		}

		if (pieces.length == 2) {
			pieces[1] = pieces[1].trim();
			if (pieces[1].equals("EBX") || pieces[1].equals("ECX") || pieces[1].equals("EDX") || pieces[1].equals("ESI")
					|| pieces[1].equals("EDI")) {
				toReturn.add(pieces[1]);
			}
		}
		return toReturn;
	}

	@Override
	public String getName() {
		return "Remove Unused Assignments";
	}

}
