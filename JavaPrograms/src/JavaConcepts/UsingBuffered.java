package JavaConcepts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBuffered {

	public static void main(String[] args) throws IOException {
		
		String location="UsingBuff.txt";
		String content="Coming to JAVA Program in a easy ways";
		FileWriter file=new FileWriter(location);
		BufferedWriter buff=new BufferedWriter(file);
		buff.write(content);
		buff.close();

	}

}
