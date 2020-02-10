package optimizers;

import dataStructures.x86.ProgramX86;

public interface Optimizer {
	void optimize(ProgramX86 prog);
}
