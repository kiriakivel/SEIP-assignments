package io;

import java.io.File;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

/**
 * A class that provides test cases for the 
 * readFile fuction of the FileIO class.
 * @author kiriakivel
 */
public class FileIOTest {
	
	FileIO fio = new FileIO();

	/*
	* A unit test that checks the valid 
	* input of a file with integers.
	*/
	@Test
	public void test_readFile_normal_case() {
		int[] expected = {1,5,6,77,13,7,987,33,12,7999,12,11,1,1,0,6};
		String resourceName = "normal.txt";
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(resourceName).getFile());
		String absolutePath = file.getAbsolutePath();
		Assert.assertArrayEquals(expected, fio.readFile(absolutePath));
	}

	/*
	* A unit test that checks the invalid 
	* input of a file with both integers and
	* other symbols which should be ignored.
	*/
	@Test
	public void test_readFile_contains_invalid_entries() {
		int[] expected = {5,1,3,4,45,88,65,123};
		String resourceName = "invalid.txt";
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(resourceName).getFile());
		String absolutePath = file.getAbsolutePath();
		Assert.assertArrayEquals(expected , fio.readFile(absolutePath));
	}

	@Rule 
	public ExpectedException thrown = ExpectedException.none();

	/*
	* A unit test that checks the invalid 
	* input of a file that does not exist
	* in any resource directory.
	*/
	@Test
	public void test_readFile_file_does_not_exist_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Input file does not exist");
		String resourceName = "notexist.txt";
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(resourceName).getFile());
		String absolutePath = file.getAbsolutePath();
		fio.readFile(absolutePath);
	}

	/*
	* A unit test that checks the invalid 
	* input of an empty file.
	*/
	@Test
	public void test_readFile_empty_file_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Given file is empty");
		String resourceName = "empty.txt";
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(resourceName).getFile());
		String absolutePath = file.getAbsolutePath();
		fio.readFile(absolutePath);
	}
}