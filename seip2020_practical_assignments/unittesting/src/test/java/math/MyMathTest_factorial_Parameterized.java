package math;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.Assert;

/**
 * A parameterized test class that checks
 * the fuctionality of the factorial method
 *  of the MyMath class.
 * @author kiriakivel
 */
@RunWith(Parameterized.class)
public class MyMathTest_factorial_Parameterized {

	@Parameter (value = 0)
	public int number;

	@Parameter (value = 1)
	public int result;

	MyMath math = new MyMath();

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{0,1},{1,1},{2,2},{3,6},{12,479001600}};
		return Arrays.asList(data);
	}

	@Test
	public void test_factorial() {
		Assert.assertEquals(result, math.factorial(number));
	}
	
}