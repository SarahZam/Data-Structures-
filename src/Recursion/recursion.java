package Recursion;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(iterativeFactorial(3));
		System.out.println(recursiveFactorial(3));
	}
	
	// 2! = 2 * 1
	// 3! = 3 * 2!
	// 4! = 4 * 3!
	//n! = n * (n-1)!
	
	public static int recursiveFactorial(int num) {
		int factorial = 1;
		
		if(num == 0) {
			return factorial;
		}
		else {
			return num * recursiveFactorial(num - 1);
		}
		
	}
	
	public static int iterativeFactorial(int num) {
		
		int factorial = 1;
		int multiplier = 1;
		
		if(num == 0) {
			return factorial;
		}
		else {
			while(multiplier<=num) {
				factorial = factorial*multiplier;
				multiplier++;
			}
			return factorial;
		}
		
	}

}
