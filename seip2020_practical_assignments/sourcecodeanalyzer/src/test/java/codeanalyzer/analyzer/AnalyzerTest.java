package codeanalyzer.analyzer;

import org.junit.Assert;
import java.io.IOException;
import org.junit.Test;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.*;

public class AnalyzerTest {
	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	
	@Test
	public void testCalculateMetrics_Regex() throws IOException {
		RegexAnalyzer regex = new RegexAnalyzer();
		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",21);
		metrics.put("nom",3);
		metrics.put("noc",3);
		assertEquals(metrics, regex.calculateMetrics(TEST_CLASS, "local"));
	}
	
	@Test
	public void testCalculateMetrics_StrComp() throws IOException {
		StrCompAnalyzer strcomp = new StrCompAnalyzer();
		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",7);
		metrics.put("nom",3);
		metrics.put("noc",3);
		assertEquals(metrics, strcomp.calculateMetrics(TEST_CLASS, "local"));
	}

	public void testCalculateMetrics_Null() throws IOException {
		NullAnalyzer nullan = new NullAnalyzer();
		assertEquals(null, nullan.calculateMetrics(TEST_CLASS, "local"));
	}
	
}