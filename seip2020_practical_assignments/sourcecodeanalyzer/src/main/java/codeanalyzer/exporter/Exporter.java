package codeanalyzer.exporter;

import java.util.Map;

/**
* The Exporter interface represents an entity
* which receives a map of metrics and a filepath
* and exports the given metrics to the specified
* file.
*
* @author  kiriakivel 
*/
public interface Exporter {
	
	public void writeFile(Map<String, Integer> metrics, String filepath);
	
}