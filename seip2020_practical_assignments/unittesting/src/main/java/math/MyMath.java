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
			int fct;
			for (int i = 1; i <= n; i++) {
				fct += i;
			}
			return fct;
		}

	}
	
}