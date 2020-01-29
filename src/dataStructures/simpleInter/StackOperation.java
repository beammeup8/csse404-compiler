package dataStructures.simpleInter;

public class StackOperation implements Statement{
	private String label;
	private boolean isPush;

	public StackOperation(String label, boolean isPush) {
		this.label = label;
		this.isPush = isPush;
	}
	
	@Override
	public String toString() {
		return toX86();
	}

	private String toX86() {
		if(isPush){
			return "\tpush" + label;
		}
		return "\tpop" + label;
	}
}
