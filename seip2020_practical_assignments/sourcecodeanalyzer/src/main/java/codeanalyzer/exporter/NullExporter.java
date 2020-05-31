package codeanalyzer.exporter;

import java.util.Map;

/**
* The NullEporter class is used when the
* user provided an unknown type of file
* to export the metrics and thus the 
* metrics can't be exported.
*
* @author  kiriakivel 
*/
public class NullExporter implements Exporter{

	public void writeFile(Map<String, Integer> metrics, String filepath) {
		System.err.println("Operation aborted due to unknown output type.");
	}
}