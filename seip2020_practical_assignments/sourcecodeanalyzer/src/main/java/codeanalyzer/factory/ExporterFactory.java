package codeanalyzer.factory;

import codeanalyzer.exporter.*;

/**
* The ExporterFactory class creates an
* Exporter object according to a String,
* which indicates the Exporter type.
*
* @author  kiriakivel 
*/
public class ExporterFactory implements AbstractFactory<Exporter>{

	public Exporter create(String type){
		if ("csv".equalsIgnoreCase(type)) {
            return new CSVExporter();
        } else if ("json".equalsIgnoreCase(type)) {
            return new JSONExporter();
        } else return new NullExporter();
	}
}