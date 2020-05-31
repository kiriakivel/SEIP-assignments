package codeanalyzer.factory;

import codeanalyzer.reader.*;

/**
* The ReaderFactory class creates an
* Reader object according to a String,
* which indicates the Reader type.
*
* @author  kiriakivel 
*/
public class ReaderFactory implements AbstractFactory<Reader>{

	public Reader create(String type){
		if ("local".equalsIgnoreCase(type)) {
            return new LocalReader();
        } else if ("web".equalsIgnoreCase(type)) {
            return new WebReader();
        } else return new NullReader();
	}
}