package codeanalyzer.factory;

import codeanalyzer.exporter.*;

public class ExporterFactory implements AbstractFactory<Exporter>{

	public Exporter create(String type){
		if ("csv".equalsIgnoreCase(type)) {
            return new CSVExporter();
        } else if ("json".equalsIgnoreCase(type)) {
            return new JSONExporter();
        } else return new NullExporter();
	}
}