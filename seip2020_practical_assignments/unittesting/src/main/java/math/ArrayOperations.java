package math;

import java.util.ArrayList;
import java.util.List;
import io.FileIO;

/**
* The ArrayOperations class provides simple operations
* on arrays for practice on Unit Testing.
*
* @author  kiriakivel 
*/
public class ArrayOperations {
	
	/**
	 * Iterates in an array of numbers and returns a new
	 * array that contains only prime numbers
	 * @param fileIO object to read the file of numbers
	 * @param filepath the path to the file of numbers
	 * @param myMath object to check if numbers are prime
	 * @return integer array of prime numbers
	 */
	int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		
		int[] numbers = fileIo.readFile(filepath);

		List<Integer> primesList = new ArrayList<>();

		for (int i=0; i<numbers.length; i++){
			if (myMath.isPrime(numbers[i])) primesList.add(numbers[i]);
		}

		// Convert a List to an array using 
		return primesList.stream().mapToInt(i -> i).toArray();
	}
}