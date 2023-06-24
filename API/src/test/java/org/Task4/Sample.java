package org.Task4;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Sample {
	public static RequestSpecification reqSpec;

	public static void main(String[] args) {
		getUser();

	}

	public static void getUser() {
		// 1. create /initialize Restassured class
		reqSpec = RestAssured.given();
		// 2. ADD header
		RequestSpecification reqspec = reqSpec.header("content-Type", "application/json");
		// 3. Mention the Path parameter
		RequestSpecification queryParam = reqspec.queryParam("status", "sold");
		Response response = queryParam.get("https://petstore.swagger.io/v2/pet/findByStatus");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String asString = body.asString();
		System.out.println(asString);
		String prettyString = body.asPrettyString();
		System.out.println(prettyString);
	}

}
