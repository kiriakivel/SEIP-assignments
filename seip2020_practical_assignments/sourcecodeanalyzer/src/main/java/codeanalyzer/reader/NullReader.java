package codeanalyzer.reader;

import java.io.IOException;
import java.util.List;

/**
* The NullReader class is used when the
* user provided an unknown type of location
* for the source file and thus the file can
* not be reached.
*
* @author  kiriakivel 
*/
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