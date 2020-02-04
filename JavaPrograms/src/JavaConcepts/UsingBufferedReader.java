package JavaConcepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		String location="UsingBuff.txt";
		
		FileReader fileR=new FileReader(location);
		BufferedReader reader=new BufferedReader(fileR);
		
		String currentline;
		while((currentline=reader.readLine())!=null){
			System.out.println(currentline);
		}

	}

}
