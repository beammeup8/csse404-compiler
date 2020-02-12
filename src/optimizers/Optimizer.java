package optimizers;

import dataStructures.x86.ProgramX86;

public interface Optimizer {
	boolean optimize(ProgramX86 prog);
}
