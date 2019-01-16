
public class ExampleOne {
	static int n =100;	
	static long[] solutions = new long[n+1];
	
	public static void main(String[] args) {
		System.out.println(factorial(7));
		
		System.out.println(fibonacci(n));
		
	}
	
	private static long fibonacci(int n) {
		if(n ==1 || n==2) {
			return 1;			
		}else if(solutions[n]!=0) {
			return solutions[n];
		}		
		else {
			solutions[n] = fibonacci(n-2) + fibonacci(n-1);
			return solutions[n];
		}
	}
	/*recursive functions make a call to themselves (recursive call)
	 * so they may solve a smaller version of the same problem
	 */
	private static int factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
		
	}

}
