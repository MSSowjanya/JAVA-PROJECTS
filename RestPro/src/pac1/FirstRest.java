package pac1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class FirstRest {
	@Test
	public void rest() {
		RestAssured.baseURI="https://reqres.in";
		RestAssured.given().when().get("/api/users/2").then().assertThat().statusCode(200);
	}
}
