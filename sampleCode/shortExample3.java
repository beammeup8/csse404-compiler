/** This is a test. */
  class Test {
    public static void main (String[] args) {
      T t = new T();
      int i = t.getNum();
      System.out.println(i);
    }
  }
  
  class T {
	  public int getNum() {
		  return 26;
	  }
  }