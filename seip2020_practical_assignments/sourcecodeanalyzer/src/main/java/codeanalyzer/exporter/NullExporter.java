package codeanalyzer.exporter;

import java.util.Map;

public class NullExporter implements Exporter{

	public void writeFile(Map<String, Integer> metrics, String filepath) {
		System.err.println("Operation aborted due to unknown output type.");
	}
}