package JavaConcepts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UsingJsonRead {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
JSONParser parser=new JSONParser();
FileReader file=new FileReader("Hobby.json");

Object parsedobj=parser.parse(file);
JSONObject json=(JSONObject)parsedobj;
String name=(String)json.get("Name");
Long age=(Long)json.get("Age");
JSONArray array=(JSONArray)json.get("Hobbies");
Iterator iter=array.iterator();
System.out.println("Name = "+name);
System.out.println("Age = "+age);
while(iter.hasNext()){
	System.out.println("Hobbies= "+iter.next());
	
}


	}

}
