package dataStructures.simpleInter;

public class Allocation implements Statement {
	public String localName;
	public String sizeLocation;
	
	public Allocation(String localName, String sizeLocation) {
		this.localName = localName;
		this.sizeLocation = sizeLocation;
	}
	
	@Override
	public String toString() {
		return "\t" + localName + " = " + "malloc(" + sizeLocation + ")";
	}

}
