package org.Task4;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Create {

	public static RequestSpecification reqSpec;
	
	public static void createUser() {
		// 1. create /initialize Restassured class
				reqSpec = RestAssured.given();
				// 2. ADD header
				RequestSpecification reqspec = reqSpec.header("Content-Type", "application/json");
				// 3. Mention the Path parameter
			RequestSpecification body2 = reqspec.body("{\r\n" + 
					"  \"id\": 101,\r\n" + 
					"  \"category\": {\r\n" + 
					"    \"id\": 102,\r\n" + 
					"    \"name\": \"German\"\r\n" + 
					"  },\r\n" + 
					"  \"name\": \"Shephard\",\r\n" + 
					"  \"photoUrls\": [\r\n" + 
					"    \"ji\"\r\n" + 
					"  ],\r\n" + 
					"  \"tags\": [\r\n" + 
					"    {\r\n" + 
					"      \"id\": 200,\r\n" + 
					"      \"name\": \"wild\"\r\n" + 
					"    }\r\n" + 
					"  ],\r\n" + 
					"  \"status\": \"sold\"\r\n" + 
					"}");
			Response post = body2.post("https://petstore.swagger.io/v2/pet\r\n" + 
					"");
				int statusCode = post.getStatusCode();
				System.out.println(statusCode);
				ResponseBody body = post.getBody();
				System.out.println(body);
				String asPrettyString = post.asPrettyString();
				System.out.println(asPrettyString);
	}
	
	public static void main(String[] args) {
		createUser();
	}

}
