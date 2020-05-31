package codeanalyzer.analyzer;

import codeanalyzer.reader.*;
import codeanalyzer.factory.*;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;

public class RegexAnalyzer implements Analyzer {

	private Reader fileReader;

	public Map<String, Integer> calculateMetrics(String filepath,String fileReaderType)throws IOException{

		AbstractFactory<Reader> rFactory = FactoryProducer.getFactory("reader");
		this.fileReader = rFactory.create(fileReaderType);

		String sourceCode = fileReader.readFileIntoString(filepath);

		Pattern patternLOC = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
		Pattern patternNOM = Pattern.compile(".*(public |protected |private |static )?[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*");
		Pattern patternNOC = Pattern.compile(".*\\s*class\\s+.*");
        
        Matcher nonCodeLinesMatcher = patternLOC.matcher(sourceCode); 
        Matcher methodSignatures = patternNOM.matcher(sourceCode);
	    Matcher classSignatures = patternNOC.matcher(sourceCode);

        int nonCodeLinesCounter = 0;
        while (nonCodeLinesMatcher.find()) {
        	nonCodeLinesCounter++;
        }
        int methodCounter = 0;
        while (methodSignatures.find()) {
        	methodCounter++;
        }
        int classCounter = 0;
        while (classSignatures.find()) {
        	classCounter++;
        }
		
        int sourceFileLength = sourceCode.split("\n").length;

		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",sourceFileLength - nonCodeLinesCounter);
		metrics.put("nom",methodCounter);
		metrics.put("noc",classCounter);

		return metrics;

	}

}