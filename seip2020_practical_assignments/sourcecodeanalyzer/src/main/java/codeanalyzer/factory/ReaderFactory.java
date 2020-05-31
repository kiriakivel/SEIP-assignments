package codeanalyzer.factory;

import codeanalyzer.reader.*;

public class ReaderFactory implements AbstractFactory<Reader>{

	public Reader create(String type){
		if ("local".equalsIgnoreCase(type)) {
            return new LocalReader();
        } else if ("web".equalsIgnoreCase(type)) {
            return new WebReader();
        } else return new NullReader();
	}
}