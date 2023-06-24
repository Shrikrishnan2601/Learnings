package org.Task4;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Delete {
	public static RequestSpecification reqSpec;
	public static void main(String[] args) {
		// 1. create /initialize Restassured class
				reqSpec = RestAssured.given();
				// 2. ADD header
				RequestSpecification reqspec = reqSpec.header("Content-Type", "application/json");
			Response post = reqspec.delete("https://petstore.swagger.io/v2/pet/100");
				int statusCode = post.getStatusCode();
				System.out.println(statusCode);
				ResponseBody body = post.getBody();
				System.out.println(body);
				String asPrettyString = post.asPrettyString();
				System.out.println(asPrettyString);
	}

}
