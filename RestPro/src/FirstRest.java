

import io.restassured.RestAssured;

public class FirstRest {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RestAssured.given().when().get("/api/users/2").then().assertThat().statusCode(200);
	}
}
