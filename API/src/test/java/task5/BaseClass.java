package task5;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	RequestSpecification reqSpec;
	Response response;
	
	public void addHeader(String key, String value) {
		reqSpec= RestAssured.given().header(key,value);
	}
	public void queryparam (String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);
	}
	public void pathparam (String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);
	}
	public void basicAuth (String username, String password) {
		reqSpec = reqSpec.auth().preemptive().basic(username, password);
	}
	public void reqBody (String body) {
		reqSpec = reqSpec.body(body);
	}
	public Response methodType (String type, String endpoint) {
		switch (type) {
		case "GET" :
			response = reqSpec.log().all().get(endpoint);
			break;
		case "POST" :
			response = reqSpec.log().all().post(endpoint);
			break;
		case "PUT" :
			response = reqSpec.log().all().put(endpoint);
			break;
		case "DELETE" :
			response = reqSpec.log().all().delete(endpoint);
			break;
		default:
			break;
		}
		return response;
	}
	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;
	}
	public ResponseBody getResponseBody(Response response) {
		ResponseBody body = response.getBody();
		return body;
	}
	public String getResponseBodyAsString(Response response) {
		String asString = getResponseBody(response).asString();
		return asString;
	}
	public String getResponseBodyAsPrettyFormat() {
		String asString = getResponseBody(response).asPrettyString();
		return asString;
	}
	
	
	
	
	
	
	
	
	
	
	
}


