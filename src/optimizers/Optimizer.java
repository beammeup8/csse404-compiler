package optimizers;

import dataStructures.x86.FunctionX86;
import dataStructures.x86.ProgramX86;

public abstract class Optimizer {
	public boolean optimize(ProgramX86 prog) {
		boolean changed = false;
		for (FunctionX86 func : prog.functions) {
			if (optimizeFunction(func)) {
				changed = true;
			}
		}
		return changed;
	}

	protected abstract boolean optimizeFunction(FunctionX86 func);
}
