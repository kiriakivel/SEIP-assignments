package codeanalyzer.reader;

import java.io.IOException;
import java.util.List;

public class NullReader implements Reader{

	public List<String> readFileIntoList(String filepath) throws IOException {
		System.err.println("Operation aborted due to unknown location type.");
		return null;
	}

	public String readFileIntoString(String filepath) throws IOException {
		System.err.println("Operation aborted due to unknown location type.");
		return null;
	}
	
}