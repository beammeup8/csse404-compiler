package dataStructures.inter1;

import java.util.List;

public class InterProgram1 implements IInter1 {

	List<InterClass1> classes;

	public InterProgram1(List<InterClass1> classes) {
		this.classes = classes;
	}
	
	@Override
	public String toString() {
		return classes.toString();
	}
}
