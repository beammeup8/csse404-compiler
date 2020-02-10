/** This is a test. */
class shortExample2 {
	public static void main(String[] args) {
		int k;
		k = new T().helloWorld(); // cool
		System.out.println(k);
	}
}

class T {
	int a;
	boolean bool;

	public int helloWorld() {
		a = 0;
		int b = 0;
		bool = false;
		while (a <= 20) {
			if (a > 15) {
				a = a + 3;
			} else if (a > 10) {
				a = a + 2;
			} else {
				a = a + 1;
			}
			b = b + 1;
			bool = !bool;
		}
		return b;
	}
}
