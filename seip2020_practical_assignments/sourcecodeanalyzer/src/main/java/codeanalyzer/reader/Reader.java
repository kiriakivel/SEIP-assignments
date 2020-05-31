package codeanalyzer.reader;

import java.util.List;
import java.io.IOException;

public interface Reader {
	public List<String> readFileIntoList(String filepath) throws IOException ;
	public String readFileIntoString(String filepath) throws IOException;
}