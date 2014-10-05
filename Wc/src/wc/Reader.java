package wc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	
private BufferedReader reader;
    
    public Reader(File f) throws FileNotFoundException {
        FileInputStream is = new FileInputStream(f);
        reader = new BufferedReader(new InputStreamReader(is));
    }
    
    public int getCountChar()  throws IOException {
    	int currentSymbol;
    	int countChar = 0;
    	while((currentSymbol = reader.read()) != -1) {
    		if(!Character.isWhitespace((char)currentSymbol)) {
    			countChar ++;
    		}
    	}
    	reader.close();
        return countChar;      
    }
    
    public int getCountWord() throws IOException {
    	String currentLine;
    	int countWords = 0;
    	while((currentLine = reader.readLine()) != null) {
    		countWords += currentLine.split("\\s").length;
    	}
    	reader.close();
        return countWords;  
    }
    
    public int getCountLines() throws IOException {
    	int countLines = 0;
    	while((reader.readLine()) != null) {
    		countLines ++;
    	}
    	reader.close();
    	return countLines;
    }

}
