package math;

import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

/**
 * A class that provides test cases for the 
 * math functions divide and multiply of
 * the ArithmeticOperations class.
 * @author kiriakivel
 */
public class ArithmeticOperationsTest {

	ArithmeticOperations ao = new ArithmeticOperations();

	/*
	* A unit test that checks the invalid 
	* division with 0 as a denominator that
	* causes an ArithmeticEception.
	*/
	@Test (expected = ArithmeticException.class)
	public void test_divide_zero_exception() {
		ao.divide(1,0);
	}

	/*
	* A unit test that checks the valid 
	* division in which the numerator is
	* bigger than the denominator.
	*/
	@Test
	public void test_divide_numerator_bigger_than_denominator() {
		Assert.assertEquals(2.33 , ao.divide(7,3), 0.005);
	}

	/*
	* A unit test that checks the valid 
	* division in which the numerator is
	* smaller than the denominator.
	*/
	@Test
	public void test_divide_numerator_smaller_than_denominator() {
		Assert.assertEquals(0.43 , ao.divide(3,7), 0.005);
	}

	/*
	* A unit test that checks the valid 
	* input for multiplication.
	*/
	@Test
	public void test_multiply_normal() {
		Assert.assertEquals(55 , ao.multiply(5,11));
	}

	@Rule 
	public ExpectedException thrown = ExpectedException.none();

	/*
	* A unit test that checks an invalid
	* negative input for the x variable which
	* causes an IllegalArgumentException.
	*/
	@Test
	public void test_multiply_x_negative_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		ao.multiply(-2,3);
	}

	/*
	* A unit test that checks an invalid
	* negative input for the y variable which
	* causes an IllegalArgumentException.
	*/
	@Test
	public void test_multiply_y_negative_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		ao.multiply(2,-3);
	}

	/*
	* A unit test that checks an invalid
	* input which produces a too large number
	* and causes an IllegalArgumentException.
	*/
	@Test
	public void test_multiply_too_large_result_RuleException(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The product does not fit in an Integer variable");
		ao.multiply(2147483647,2);
	}
	
}