package optimizers;

import dataStructures.x86.FunctionX86;
import dataStructures.x86.ProgramX86;

public abstract class Optimizer {
	public int optimize(ProgramX86 prog) {
		int changed = 0;
		for (FunctionX86 func : prog.functions) {
			changed += optimizeFunction(func);
		}
		return changed;
	}

	protected abstract int optimizeFunction(FunctionX86 func);

	public abstract String getName();
}
