package math;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A test suite for the test classes 
 * for the MyMath class.
 * @author kiriakivel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class, MyMathTest_factorial_Parameterized.class})
public class MyMathTestSuite{}