package codeanalyzer.analyzer;

import java.util.Map;
import java.io.IOException;

public interface Analyzer {
	
	public Map<String, Integer> calculateMetrics(String filepath,String fileReaderType)throws IOException;
	
}