package task5;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class JiraIntegration extends BaseClass {
	@Test(priority=1)
	public void getUser() {
		addHeader("Content-Type", "application/json");
		basicAuth("manojkrishnan619@gmail.com", "2KtC4vETcZSeIx61uZT9927D");
		Response response2 = methodType("GET", "https://manojkrishnan.atlassian.net/rest/api/2/search");
		int statusCode = getStatusCode(response2);
		System.out.println(statusCode);
		String prettyFormat = getResponseBodyAsPrettyFormat();
		System.out.println(prettyFormat);
	}
	@Test(priority=2)
	public void postPet() {
		addHeader("Content-Type", "application/json");
		basicAuth("manojkrishnan619@gmail.com", "2KtC4vETcZSeIx61uZT9927D");
		reqBody("{\r\n" + 
				"  \"id\": 12345,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 10,\r\n" + 
				"    \"name\": \"puppy\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"seenu\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 0,\r\n" + 
				"      \"name\": \"home\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}");
		Response response2 = methodType("POST", "https://petstore.swagger.io/v2/pet");
		System.out.println(getStatusCode(response2));
		System.out.println(getResponseBodyAsPrettyFormat());
		
	}
	@Test(priority=3)
	public void putPet() {
		addHeader("Content-Type", "application/json");
		basicAuth("manojkrishnan619@gmail.com", "2KtC4vETcZSeIx61uZT9927D");
		reqBody("{\r\n" + 
				"  \"id\": 12345,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"name\": \"Tommy\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"doggie\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 0,\r\n" + 
				"      \"name\": \"Wild\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}");
		Response response2 = methodType("PUT", "https://petstore.swagger.io/v2/pet");
		System.out.println(getStatusCode(response2));
		System.out.println(getResponseBodyAsPrettyFormat());
		
	}
	@Test(priority=4)
	public void deletePet() {
		addHeader("Content-Type", "application/json");
		basicAuth("manojkrishnan619@gmail.com", "2KtC4vETcZSeIx61uZT9927D");
		pathparam("id", "100");
		Response response2 = methodType("DELETE", "https://petstore.swagger.io/v2/pet/{id}");
		System.out.println(getStatusCode(response2));
		System.out.println(getResponseBodyAsPrettyFormat());
	}
	
}
