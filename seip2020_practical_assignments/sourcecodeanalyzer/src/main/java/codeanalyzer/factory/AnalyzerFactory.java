package codeanalyzer.factory;

import codeanalyzer.analyzer.*;

public class AnalyzerFactory implements AbstractFactory<Analyzer>{

	public Analyzer create(String type){
		if ("regex".equalsIgnoreCase(type)) {
            return new RegexAnalyzer();
        } else if ("strcomp".equalsIgnoreCase(type)) {
            return new StrCompAnalyzer();
        } else return new NullAnalyzer();
	}
}