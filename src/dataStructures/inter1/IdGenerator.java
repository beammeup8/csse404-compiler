package dataStructures.inter1;

public class IdGenerator {
	private static long num, labelNum = 0;
	
	public static String getUniqueId() {
		String s = "_temp" + num;
		num++;
		return s;
	}
	
	public static String getUniqueLabel() {
		String s = "_label" + labelNum;
		labelNum++;
		return s;
	}
}
