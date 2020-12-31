package rest;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class CompareHeadeAndrBody {
	@Test
	public void testCreateUser(){
		RestAssured.baseURI="https://reqres.in";
		given().header("Content-Type","application/json")
		.and()
		.body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}")
		.when()
		.post("/api/users")
		.then().assertThat().statusCode(201)
	    .and()
	    .header("Server", "cloudflare")
	    .and()
	    .body("name", Matchers.equalTo("morpheus"));
	}

}
