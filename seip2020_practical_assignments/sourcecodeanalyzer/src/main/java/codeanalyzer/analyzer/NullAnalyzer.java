package codeanalyzer.analyzer;

import java.util.Map;

public class NullAnalyzer implements Analyzer {

	public Map<String, Integer> calculateMetrics(String filepath,String fileReaderType){
		
		System.err.println("Operation aborted due to unknown analyzer type.");
		return null;

	}

}