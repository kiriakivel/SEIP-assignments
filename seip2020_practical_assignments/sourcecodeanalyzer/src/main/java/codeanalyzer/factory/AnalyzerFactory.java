package codeanalyzer.factory;

import codeanalyzer.analyzer.*;

/**
* The AnalyzerFactory class creates an
* Analyzer object according to a String,
* which indicates the Analyzer type.
*
* @author  kiriakivel 
*/
public class AnalyzerFactory implements AbstractFactory<Analyzer>{

	public Analyzer create(String type){
		if ("regex".equalsIgnoreCase(type)) {
            return new RegexAnalyzer();
        } else if ("strcomp".equalsIgnoreCase(type)) {
            return new StrCompAnalyzer();
        } else return new NullAnalyzer();
	}
}