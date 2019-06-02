package rest_assured.actor;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import com.google.gson.JsonObject;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AllMethods {

	@Before
	public void setUp() {
		RestAssured.baseURI = "http://localhost:3000";
	}

	// @Test
	public void addActor() {
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		JsonObject requestBody = new JsonObject();
		requestBody.addProperty("first_name", "Test");
		requestBody.addProperty("last_name", "Tester");
		httpRequest.body(requestBody.toString());
		Response response;
		response = httpRequest.post("/actor");
		response.then().statusCode(201);
		response = httpRequest.get("/actor");
		response.then().body("first_name", hasItem("Test"));
		response.then().body("last_name", hasItem("Tester"));
		System.out.println(httpRequest.get("/actor").asString());
	}

	@Test
	public void addActor2() {
		JsonObject requestBody = new JsonObject();
		requestBody.addProperty("first_name", "Test2");
		requestBody.addProperty("last_name", "Tester2");
		
		given().when().contentType("application/json").
		and().body(requestBody.toString()).
		and().post("/actor").then()
				.statusCode(201);
		
		given().when().get("/actor").then()
		.and().log().body()
		.body("first_name", hasItem("Test2"))
		.body("last_name", hasItem("Tester2"))
		.statusCode(200);
		
		
		
		
		
	}

}
