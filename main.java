/**
 * 
 * @author Sharlton Shepeluk
 *
 * Main method that calls a recursive static method that
 * returns the nth term in the Fibonacci sequence.
  */



public class main {

	
	public static void main(String[] args) {

		int n = 10; // Fibonacci method calculates nth number in sequence

		int fibOutput = rFib(n);
		System.out.println("The " + n + "th term in the Fibonacci sequence is " + fibOutput + ".");

	}// end main

/**
 * 
 * Recursive fibonacci method
 * 	
 * @param n a specified integer that tells the method what number in the Fib sequence
 * 			to calculate for	 
 * @return the integer at the nth number in the Fib sequence 
 */
	
	public static int rFib(int n) {

		if (n <= 1) {
			return n;
		} else {
			return rFib(n - 1) + rFib(n - 2);
		}
	}

}
