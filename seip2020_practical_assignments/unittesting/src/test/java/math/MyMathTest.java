package math;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

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

}