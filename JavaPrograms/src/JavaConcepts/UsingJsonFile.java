package JavaConcepts;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class UsingJsonFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
JSONObject obj=new JSONObject();
obj.put("Name", "Deva");
obj.put("Age", 27);

//to write the Json array

JSONArray array=new JSONArray();

array.add("Painting");
array.add("Learning");
array.add("Swimming");

obj.put("Hobbies", array);

FileWriter filewrit=new FileWriter("Hobby.json");
filewrit.write(obj.toJSONString());
filewrit.close();
	}

}
