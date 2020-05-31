package codeanalyzer.exporter;

import java.util.Map;

public interface Exporter {
	
	public void writeFile(Map<String, Integer> metrics, String filepath);
	
}