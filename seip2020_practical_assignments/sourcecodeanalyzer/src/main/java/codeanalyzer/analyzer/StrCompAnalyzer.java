package codeanalyzer.analyzer;

import codeanalyzer.factory.*;
import codeanalyzer.reader.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.IOException;

/**
* The StrCompAnalyzer class is used when the
* user wants to calculate the metrics by use
* of String comparison.
*
* @author  kiriakivel 
*/
public class StrCompAnalyzer implements Analyzer {

	private Reader fileReader;

	public Map<String, Integer> calculateMetrics(String filepath,String fileReaderType)throws IOException{

		AbstractFactory<Reader> rFactory = FactoryProducer.getFactory("reader");
		this.fileReader = rFactory.create(fileReaderType);

		List<String> sourceCodeList = fileReader.readFileIntoList(filepath);

		int nonCodeLinesCounter = 0;
		int methodCounter = 0;
		int classCounter = 0;

		for (String line : sourceCodeList) {
			line = line.stripLeading().stripTrailing(); //clear all leading and trailing white spaces
			if (line.startsWith("//") || line.startsWith("/*") || line.startsWith("*") || line.equals("{") || line.equals("}") || line.equals(""))
				nonCodeLinesCounter++;
			if ( ((line.contains("public") || line.contains("private") || line.contains("protected"))
					|| line.contains("void") || line.contains("int") || line.contains("String"))
				&& line.contains("(") && line.contains(")") && line.contains("{") )
				methodCounter++;
			if ((line.startsWith("class ") || line.contains(" class ")) && line.contains("{")) {
				classCounter++;
			}
		}

		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",sourceCodeList.size() - nonCodeLinesCounter);
		metrics.put("nom",methodCounter);
		metrics.put("noc",classCounter);

		return metrics;

	}

}