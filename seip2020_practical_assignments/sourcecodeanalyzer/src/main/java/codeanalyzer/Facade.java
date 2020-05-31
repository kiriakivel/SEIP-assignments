package codeanalyzer;

import codeanalyzer.factory.*;
import codeanalyzer.analyzer.*;
import codeanalyzer.exporter.*;
import java.util.Map;
import java.io.IOException;

public class Facade{

	public void generateCodeMetrics(String filepath,String sourceCodeAnalyzerType,
		String sourceFileLocation,String outputFilePath,String outputFileType)throws IOException{

		//analyzer object
		AbstractFactory<Analyzer> aFactory = FactoryProducer.getFactory("analyzer");
		Analyzer analyzer = aFactory.create(sourceCodeAnalyzerType);

		//call analyzer function
		Map<String, Integer> metrics = analyzer.calculateMetrics(filepath,sourceFileLocation);

		//exporter object
		AbstractFactory<Exporter> eFactory = FactoryProducer.getFactory("exporter");		
		Exporter exporter = eFactory.create(outputFileType);
		
		//call exporter function
		exporter.writeFile(metrics, outputFilePath);
	}
}