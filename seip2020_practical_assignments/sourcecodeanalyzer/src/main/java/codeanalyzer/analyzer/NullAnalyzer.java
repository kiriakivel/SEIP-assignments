package codeanalyzer.analyzer;

import java.util.Map;

/**
* The NullAnalyzer class is used when the
* user provided an unknown type of code
* analyzer and thus the metrics can't be
* calculated.
*
* @author  kiriakivel 
*/
public class NullAnalyzer implements Analyzer {

	public Map<String, Integer> calculateMetrics(String filepath,String fileReaderType){
		
		System.err.println("Operation aborted due to unknown analyzer type.");
		return null;

	}

}