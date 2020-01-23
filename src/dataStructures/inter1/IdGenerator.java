package dataStructures.inter1;

public class IdGenerator {
	private static long num = 0;
	
	public static String getUniqueId() {
		String s = "_temp" + num;
		num++;
		return s;
	}
}
