package io;

import java.io.File;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class FileIOTest {
	
	FileIO fio = new FileIO();

	@Test
	public void test_readFile_normal_case() {
		int[] expected = {1,5,6,77,13,7,987,33,12,7999,12,11,1,1,0,6};
		String resourceName = "normal.txt";
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(resourceName).getFile());
		String absolutePath = file.getAbsolutePath();
		Assert.assertArrayEquals(expected, fio.readFile(absolutePath));
	}

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