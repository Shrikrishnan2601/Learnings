package org.task;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListUser {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader("D:\\Krishna\\JAVA\\API\\src\\test\\resources\\JSONFiles\\listuser.json");
		JSONParser jsonParser = new JSONParser();
		Object object = jsonParser.parse(reader);
		JSONObject jsonObject = (JSONObject) object;
		Object object2 = jsonObject.get("page");
		System.out.println(object2);
		Object object3 = jsonObject.get("per_page");
		System.out.println(object3);
		Object object4 = jsonObject.get("total");
		System.out.println(object4);
		Object object5 = jsonObject.get("total_pages");
		System.out.println(object5);
		Object object6 = jsonObject.get("data");
		JSONArray a = (JSONArray) object6;
		for (int i=0; i<a.size(); i++) {
			Object object7 = a.get(i);
			JSONObject j = (JSONObject) object7;
			System.out.println(j.get("id"));
			System.out.println(j.get("email"));
			System.out.println(j.get("first_name"));
			System.out.println(j.get("last_name"));
			System.out.println(j.get("avatar"));
			
		}
		Object object8 = jsonObject.get("support");
		JSONObject s = (JSONObject) object8;
		System.out.println(s.get("url"));
		System.out.println(s.get("text"));
		
		
	}

}
