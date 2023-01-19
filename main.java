//Sharlton Shepeluk

public class main {

	// Recursive Fibonacci Method ================================================
	public static int rFib(int n) {

		if (n <= 1) {
			return n;
		} else {
			return rFib(n - 1) + rFib(n - 2);
		}
	}

	// Main ======================================================================
	public static void main(String[] args) {

		int n = 10; // Fibonacci method calculates nth number in sequence

		
		int fibOutput = rFib(n);
		System.out.println("The " + n + "th term in the Fibonacci sequence is " + fibOutput + ".");

	}// end main

}
