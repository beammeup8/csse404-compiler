package dataStructures.simpleInter;

public class MemoryAccess implements Statement {
	public String registerLabel, memoryLabel, offsetLabel;
	public boolean isRead;

	public MemoryAccess(String registerLabel, String memoryLabel, String offsetLabel, boolean isRead) {
		this.registerLabel = registerLabel;
		this.memoryLabel = memoryLabel;
		this.offsetLabel = offsetLabel;
		this.isRead = isRead;
	}

	@Override
	public String toString() {
		if (isRead) {
			return "\t" + registerLabel + " = " + memoryLabel + "[" + offsetLabel + "]";
		}
		return "\t" + memoryLabel + "[" + offsetLabel + "]" + " = " + registerLabel;
	}
}
