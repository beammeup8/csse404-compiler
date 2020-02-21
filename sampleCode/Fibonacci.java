class Fibonacci{
    public static void main(String[] a){
    	System.out.println(new Fib().ComputeFib(43));
    }
}

class Fib {

    public int ComputeFib(int num){
	int num_aux ;
	if (num < 3)
	    num_aux = 1 ;
	else 
	    num_aux = (this.ComputeFib(num-1)) + (this.ComputeFib(num-2)) ;
	return num_aux ;
    }

}