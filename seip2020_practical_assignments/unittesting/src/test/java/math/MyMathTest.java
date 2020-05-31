package math;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
import org.junit.Assert;

/**
 * A class that provides test cases for the 
 * fuctions of the MyMath class.
 * @author kiriakivel
 */
public class MyMathTest {

	MyMath math = new MyMath();

	@Rule 
	public ExpectedException thrown = ExpectedException.none();

	/*
	* A unit test that checks the invalid 
	* input of a negative number, which
	* causes IllegalArgumentException.
	*/
	@Test
	public void test_factorial_n_negative_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The number should be between 1 and 12!");
		math.factorial(-1);
	}

	/*
	* A unit test that checks the invalid 
	* input of a number larger than 12,
	* which causes IllegalArgumentException.
	*/
	@Test
	public void test_factorial_n_larger_than_12_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The number should be between 1 and 12!");
		math.factorial(13);
	}

	/*
	* A unit test that checks the valid
	* input of a prime number.
	*/
	@Test
	public void test_isPrime_normal_case_true() {
		Assert.assertTrue(math.isPrime(2));
	}

	/*
	* A unit test that checks the valid
	* input of a non-prime number.
	*/
	@Test
	public void test_isPrime_normal_case_false() {
		Assert.assertFalse(math.isPrime(4));
	}

	/*
	* A unit test that checks the invalid
	* input of a number less than 2.
	*/
	@Test
	public void test_isPrime_less_than_2_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Number must be equal or greater than 2.");
		math.isPrime(1);
	}

}