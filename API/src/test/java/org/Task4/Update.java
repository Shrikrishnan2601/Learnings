package org.Task4;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Update {
	public static RequestSpecification reqSpec;

	public static void main(String[] args) {
		// 1. create /initialize Restassured class
		reqSpec = RestAssured.given();
		// 2. ADD header
		RequestSpecification reqspec = reqSpec.header("Content-Type", "application/json");
		// 3. Mention the Path parameter
	RequestSpecification body2 = reqspec.body("{\r\n" + 
			"  \"id\": 100,\r\n" + 
			"  \"category\": {\r\n" + 
			"    \"id\": 0,\r\n" + 
			"    \"name\": \"Krish\"\r\n" + 
			"  },\r\n" + 
			"  \"name\": \"doggie\",\r\n" + 
			"  \"photoUrls\": [\r\n" + 
			"    \"string\"\r\n" + 
			"  ],\r\n" + 
			"  \"tags\": [\r\n" + 
			"    {\r\n" + 
			"      \"id\": 0,\r\n" + 
			"      \"name\": \"string\"\r\n" + 
			"    }\r\n" + 
			"  ],\r\n" + 
			"  \"status\": \"available\"\r\n" + 
			"}");
	Response post = body2.put("https://petstore.swagger.io/v2/pet");
		int statusCode = post.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = post.getBody();
		System.out.println(body);
		String asPrettyString = post.asPrettyString();
		System.out.println(asPrettyString);

	}

}
