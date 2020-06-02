package codeanalyzer.factory;

import org.junit.Assert;
import org.junit.Test;
import codeanalyzer.analyzer.*;
import codeanalyzer.exporter.*;
import codeanalyzer.reader.*;

public class FactoryTest{
	
	@Test
	public void test_getFactory_Analyzer(){
		Assert.assertTrue(FactoryProducer.getFactory("analyzer") instanceof AnalyzerFactory);
	}
	@Test
	public void test_getFactory_Reader(){
		Assert.assertTrue(FactoryProducer.getFactory("reader") instanceof ReaderFactory);
	}
	@Test
	public void test_getFactory_Exporter(){
		Assert.assertTrue(FactoryProducer.getFactory("exporter") instanceof ExporterFactory);
	}
	@Test
	public void test_getFactory_Null(){
		Assert.assertEquals(null,FactoryProducer.getFactory("unkwown"));
	}
	@Test
	public void test_create_Analyzer_Regex(){
		AnalyzerFactory af = new AnalyzerFactory();
		Assert.assertTrue(af.create("regex") instanceof RegexAnalyzer);
	}
	@Test
	public void test_create_Analyzer_StrComp(){
		AnalyzerFactory af = new AnalyzerFactory();
		Assert.assertTrue(af.create("strcomp") instanceof StrCompAnalyzer);
	}
	@Test
	public void test_create_Analyzer_Null(){
		AnalyzerFactory af = new AnalyzerFactory();
		Assert.assertTrue(af.create("unkwown") instanceof NullAnalyzer);
	}
	@Test
	public void test_create_Reader_Web(){
		ReaderFactory rf = new ReaderFactory();
		Assert.assertTrue(rf.create("web") instanceof WebReader);
	}
	@Test
	public void test_create_Reader_Local(){
		ReaderFactory rf = new ReaderFactory();
		Assert.assertTrue(rf.create("local") instanceof LocalReader);
	}
	@Test
	public void test_create_Reader_Null(){
		ReaderFactory rf = new ReaderFactory();
		Assert.assertTrue(rf.create("unkwown") instanceof NullReader);
	}
	@Test
	public void test_create_Exporter_CSV(){
		ExporterFactory ef = new ExporterFactory();
		Assert.assertTrue(ef.create("csv") instanceof CSVExporter);
	}
	@Test
	public void test_create_Exporter_JSON(){
		ExporterFactory ef = new ExporterFactory();
		Assert.assertTrue(ef.create("json") instanceof JSONExporter);
	}
	@Test
	public void test_create_Exporter_Null(){
		ExporterFactory ef = new ExporterFactory();
		Assert.assertTrue(ef.create("unkwown") instanceof NullExporter);
	}
}