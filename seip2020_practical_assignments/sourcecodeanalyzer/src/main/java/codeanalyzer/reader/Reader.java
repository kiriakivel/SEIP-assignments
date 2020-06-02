package codeanalyzer.reader;

import java.util.List;
import java.io.IOException;

/**
* The Reader interface represents an entity
* which receives a filepath and reads the file
* into a List or a String object.
*
* @author  kiriakivel 
*/
public interface Reader {
	public List<String> readFileIntoList(String filepath) throws IOException ;
	public String readFileIntoString(String filepath) throws IOException;
}