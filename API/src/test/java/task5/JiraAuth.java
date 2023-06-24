package task5;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class JiraAuth {
	
public static RequestSpecification reqSpec;
	
	public static void createUser() {
		// 1. create /initialize Restassured class
				reqSpec = RestAssured.given();
				// 2. ADD header
				RequestSpecification reqspec = reqSpec.header("Content-Type", "application/json");
				RequestSpecification basic = reqspec.auth().preemptive().basic("manojkrishnan619@gmail.com", "2KtC4vETcZSeIx61uZT9927D");
				Response response = basic.log().all().get("https://manojkrishnan.atlassian.net/rest/api/2/search");
				int statusCode = response.getStatusCode();
				System.out.println(statusCode);
				ResponseBody body = response.getBody();
				System.out.println(body.asPrettyString());
				
	}
	
	public static void main(String[] args) {
		createUser();
	}

}


