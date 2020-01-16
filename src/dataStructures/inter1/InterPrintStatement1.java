package dataStructures.inter1;

public class InterPrintStatement1 implements IInterStatement1 {

	private IInterExpression1 toPrint;
	
	public InterPrintStatement1(IInterExpression1 toPrint) {
		this.toPrint = toPrint;
	}
	
	@Override
	public String toString() {
		return "Print: {toPrint: " + toPrint.toString() + "}";
	}

}
