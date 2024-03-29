package codeanalyzer.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
* The WebReader class is used when the
* given file is located in a website.
*
* @author  kiriakivel 
*/
public class WebReader implements Reader{
	public List<String> readFileIntoList(String filepath) throws IOException {
        List<String> lines = new ArrayList<>();
        URL url = new URL(filepath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = null;
        while ((line = reader.readLine()) != null) {
        	lines.add(line);
        }
        reader.close();
        return lines;
    }

    public String readFileIntoString(String filepath) throws IOException {
    	StringBuilder sb = new StringBuilder();
	    URL url = new URL(filepath);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	    String line = null;
	    while ((line = reader.readLine()) != null) {
	    	sb.append(line + "\n");
	    }
	    reader.close();
	    	return sb.toString();
    }
}