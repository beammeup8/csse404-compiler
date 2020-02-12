package optimizers;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;
import dataStructures.x86.FunctionX86;
import dataStructures.x86.ProgramX86;

public class ImmediateInLiner implements Optimizer {

	@Override
	public boolean optimize(ProgramX86 prog) {
		boolean changed = false;
		for (FunctionX86 func : prog.functions) {
			if (optimizeFunction(func)) {
				changed = true;
			}
		}
		return changed;
	}

	private boolean optimizeFunction(FunctionX86 func) {
		boolean hasChanged = true;
		while (hasChanged) {
			hasChanged = false;
			for (int i = 0; i < func.commands.size() - 1; i++) {
				Command a1 = func.commands.get(i);
				Command a2 = func.commands.get(i + 1);
				if (a1.type == CommandType.MOV && a2.type == CommandType.MOV) {
					if (!a1.param2.startsWith("DWORD") && !a1.param1.startsWith("DWORD") && a1.param1.equals(a2.param2)) {
						func.commands.remove(i + 1);
						func.commands.remove(i);
						func.commands.add(i, new Command(CommandType.MOV, a2.param1, a1.param2));
						hasChanged = true;
						i--;
					}
				}
			}
		}
		return hasChanged;
	}

}
