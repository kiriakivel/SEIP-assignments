package client;

import codeanalyzer.Facade;
import java.io.IOException;

/**
* The Client class initates the functionality
* of the sourcecodeanalyzer module.
*
* @author  kiriakivel 
*/
public class Client {

	/**
	 * Reads the command line arguments and passes them to
	 * the facade object which then operates the code analysis.
	 * @param args command line arguments about user preferences
	 * @exception IOException when there's a problem with the file 
	 */
	public static void main(String[] args)throws IOException{
		String filepath = "src/main/resources/TestClass.java";
		String sourceCodeAnalyzerType = "regex";
		String sourceFileLocation = "local";
		String outputFilePath = "output_metrics";
		String outputFileType = "csv";
		
		if(args.length == 5) {
			filepath = args[0];
			sourceCodeAnalyzerType = args[1];
			sourceFileLocation = args[2];
			outputFilePath = args[3];
			outputFileType = args[4];
		} else if (args.length != 0) {
			System.out.println("Incorrect number of arguments.");
			System.exit(1);
		}
		
		Facade facade = new Facade();
		facade.generateCodeMetrics(filepath,sourceCodeAnalyzerType,
			sourceFileLocation,outputFilePath,outputFileType);
	}
}