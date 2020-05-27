package math;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
import org.junit.Assert;

public class MyMathTest {

	MyMath math = new MyMath();

	@Rule 
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test_factorial_n_negative_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The number should be between 1 and 12!");
		math.factorial(-1);
	}

	@Test
	public void test_factorial_n_larger_than_12_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The number should be between 1 and 12!");
		math.factorial(13);
	}

	@Test
	public void test_isPrime_normal_case_true() {
		Assert.assertTrue(math.isPrime(2));
	}

	@Test
	public void test_isPrime_normal_case_false() {
		Assert.assertFalse(math.isPrime(4));
	}

	@Test
	public void test_isPrime_less_than_2_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Number must be equal or greater than 2.");
		math.isPrime(1);
	}

}