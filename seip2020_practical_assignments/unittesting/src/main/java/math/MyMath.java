package math;

/**
* The MyMath class provides simple arithmetic operations
* that serve as hands-on practice on Unit Testing.
*
* @author  kiriakivel
*/
public class MyMath {

	/**
	 * Calculates and returns the factorial of a given number n.
	 * @param n the number we want to calculate its factorial
	 * @return the result of the calculation, the factorial of number n
	 * @exception IllegalArgumentException when n is negative or larger than 12
	 */
	public int factorial(int n) {

		if (n<0 || n>12) {
			throw new IllegalArgumentException("The number should be between 1 and 12!");
		} else {
			int fct = 0;
			for (int i = 1; i <= n; i++) {
				fct += i;
			}
			return fct;
		}

	}

	/**
	 * Checks whether the given number n is a prime number.
	 * @param n the number we want to check for being prime.
	 * @return isPrime, boolean value indicating primality of n.
	 * @exception IllegalArgumentException when n is less than 2.
	 */
	public boolean isPrime(int n) {
		if (n>=2) {
	        for(int i = 2; i <= n/2; ++i){
	            // condition for nonprime number
	            if(n % i == 0)
	            {
	                return false;
	            }
	        }
		} else
			throw new IllegalArgumentException("Number must be equal or greater than 2.");
		return true;	
	}
	
}