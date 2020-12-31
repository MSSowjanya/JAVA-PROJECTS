package package1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class ListUsers {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		Response response=given().queryParam("page", "2").when().get("/api/users/2").then().assertThat().statusCode(200).extract().response();
		System.out.println(response.asString());

	}

}
