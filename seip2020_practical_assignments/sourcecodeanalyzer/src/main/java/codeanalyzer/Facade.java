package codeanalyzer;

import codeanalyzer.factory.*;
import codeanalyzer.analyzer.*;
import codeanalyzer.exporter.*;
import java.util.Map;
import java.io.IOException;

/**
* The Facade class is called by the client
* to make the necessary function calls to
* read the file, calculate the metrics and
* export them to the destination file.
*
* @author  kiriakivel 
*/
public class Facade{
	/**
	 * Performs method calls to operate the module's functionality.
	 * @param filepath the location of the source file
	 * @param sourceCodeAnalyzerType the type of analysis for the metrics
	 * @param sourceFileLocation the type of file location (e.g. web)
	 * @param outputFilePath the path to the destination file
	 * @param outputFileType the type of file we'll export the metrics to
	 * @exception IOException when there's a problem with the file
	 */
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