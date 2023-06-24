package org.task;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader =new FileReader("D:\\Krishna\\JAVA\\API\\src\\test\\resources\\JSONFiles\\Employee.json");
		JSONParser jsonParser = new JSONParser();
		Object object = jsonParser.parse(reader);
		JSONObject jsonObject = (JSONObject) object;
		Object data = jsonObject.get("data");
		System.out.println(data);
		JSONObject jdata = (JSONObject) data;
		System.out.println(jdata.get("id"));
		System.out.println(jdata.get("email"));
		System.out.println(jdata.get("first_name"));		
		System.out.println(jdata.get("last_name"));
		System.out.println(jdata.get("avatar"));
		
		Object support = jsonObject.get("support");
		System.out.println(support);
		JSONObject jsupport = (JSONObject) support;
		System.out.println(jsupport.get("url"));
		System.out.println(jsupport.get("text"));
		
	}

}
