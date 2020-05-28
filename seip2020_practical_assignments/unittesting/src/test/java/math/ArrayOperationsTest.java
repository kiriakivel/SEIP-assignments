package math;

import io.FileIO;
import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.*;

public class ArrayOperationsTest {
	
	ArrayOperations aop = new ArrayOperations();

	@Test
	public void test_findPrimesInFile(){

		MyMath mm = mock(MyMath.class);
		when(mm.isPrime(2)).thenReturn(true);
		when(mm.isPrime(3)).thenReturn(true);
		when(mm.isPrime(4)).thenReturn(false);
		when(mm.isPrime(5)).thenReturn(true);
		when(mm.isPrime(6)).thenReturn(false);
		when(mm.isPrime(7)).thenReturn(true);
		when(mm.isPrime(8)).thenReturn(false);

		FileIO fio = mock(FileIO.class);
		int[] numbers = {2,3,4,5,6,7,8};
		when(fio.readFile("mock.txt")).thenReturn(numbers);

		int[] expected = {2,3,5,7};
		String resourceName = "mock.txt";

		Assert.assertArrayEquals(expected,aop.findPrimesInFile(fio,resourceName,mm));
	}

}