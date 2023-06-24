package org.Task4;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PetId {
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
		RequestSpecification pathParam = reqspec.pathParam("pet", "100");
		// 4. mention the method type
		Response response = pathParam.get("https://petstore.swagger.io/v2/{pet}");
		// 5. get the status code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		// 6. get the response body
		ResponseBody body = response.getBody();
		String asString = body.asString();
		System.out.println(asString);
		// 7. pretty format
		String prettyString = body.asPrettyString();
		System.out.println(prettyString);
	}

}
