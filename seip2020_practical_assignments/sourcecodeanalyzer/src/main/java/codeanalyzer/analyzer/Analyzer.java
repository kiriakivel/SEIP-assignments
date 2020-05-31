package codeanalyzer.analyzer;

import java.util.Map;
import java.io.IOException;

/**
* The Analyzer interface represents an entity
* which receives a filepath, reads the file
* calculates code metrics and returns them in
* a map of Strings and integers.
*
* @author  kiriakivel 
*/
public interface Analyzer {
	
	public Map<String, Integer> calculateMetrics(String filepath,String fileReaderType)throws IOException;
	
}