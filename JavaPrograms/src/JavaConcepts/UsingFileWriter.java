package JavaConcepts;

import java.io.FileWriter;
import java.io.IOException;


public class UsingFileWriter {
	
	public static void main(String[] args) throws IOException {
	
		String location="UsingFileWriter.txt";
				String content="Learning JAVA is easy!";
				FileWriter filewrite=new FileWriter(location);
				filewrite.write(content);
				filewrite.close();
	}

}
