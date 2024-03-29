package codeanalyzer.factory;

/**
* The FactoryProducer class is used to create
* a factory object of the specified category.
*
* @author  kiriakivel 
*/
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String factoryType){
         
        if("analyzer".equalsIgnoreCase(factoryType)){
            return new AnalyzerFactory();
        }
        else if("reader".equalsIgnoreCase(factoryType)){
            return new ReaderFactory();
        }
        else if("exporter".equalsIgnoreCase(factoryType)){
            return new ExporterFactory();
        }     
        return null;
	}

}