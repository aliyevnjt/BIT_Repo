package rest_assured.actor;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.junit.Test;


import com.google.gson.JsonObject;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstRestAssured {

	// @Test
	public void getAllActors() {
		Response resp = given().when().get("http://localhost:3000/actor");
		given().when().get("http://localhost:3000/actor").then().assertThat().body("[0].actor_id", equalTo(2));

		given().when().get("http://localhost:3000/actor").then().assertThat().body("first_name",
				hasItems("Nick", "Ed"));

		given().when().get("http://localhost:3000/actor").then().statusCode(200);

		given().when().get("http://localhost:3000/actor").then().log().body();

	}

	// @Test
	public void getAllActors1() {
		given().when().get("http://localhost:3000/actor").then().assertThat().body("findAll {it.actor_id<4}.first_name",
				hasItems("Nick", "Ed"));
		String res = given().when().get("http://localhost:3000/actor").asString();
		List<String> list = JsonPath.from(res).getList("findAll {it.actor_id<4}.first_name");
		System.out.println(list);

	}

	// @Test
	public void getAllActors2() {
		given().when().get("http://localhost:3000/actor").then().assertThat()
				.body("first_name.collect { it.length() }.sum()", greaterThan(1000));
		double res = given().when().get("http://localhost:3000/actor").jsonPath()
				.getDouble("first_name.collect { it.length() }.sum()");
//		List<String> list  = JsonPath.from(res).getList("{it.actor_id<4}.first_name");
		System.out.println(res);

	}

	// @Test
	public void getAllActors3() {
		String res = given().when().get("http://localhost:3000/actor").asString();
		List<Object> list = JsonPath.from(res).getList("$");
		System.out.println(list);
		System.out.println(list.get(2).getClass());
		Map<Object, Object> map = new HashMap<Object, Object>();
		map = (Map<Object, Object>) list.get(2);
		System.out.println(map.get("actor_id"));

	}

	// @Test
	public void getAllActors4() {
		String res = given().when().get("http://localhost:3000/actor").asString();
		List<Object> list = JsonPath.given(res).get("$");
		System.out.println(((Map) list.get(0)).get("actor_id"));

	}

	//@Test
	public void getAllActors5() {
		String res = given().when().get("http://localhost:3000/actor").asString();
		JsonPath json = new JsonPath(res);
		System.out.println(json.getString("$"));
//		System.out.println(json.getString("first_name"));
//		System.out.println(json.getList("$"));
//		System.out.println(json.getMap("[0]"));
//		System.out.println(json.getString("[0].first_name"));
//		System.out.println(json.getList("first_name"));
//		System.out.println(json.getInt("[0].actor_id"));

	}
	
	@Test
	public void addActors() {
		 	RestAssured.baseURI = "http://localhost:3000";
	        RequestSpecification httpRequest = RestAssured.given();
	        httpRequest.header("Content-Type", "application/json");
	        // Create new JSON Object
	        JsonObject loginCredentials = new JsonObject();
	        loginCredentials.addProperty("first_name", "Test");
	        loginCredentials.addProperty("last_name", "Tester");
	        httpRequest.body(loginCredentials.toString());
	        System.out.println(loginCredentials);
//	        Response response = httpRequest.post("/actor");
	        
	        
	        //Response response = httpRequest.delete("/actor?actor_id=eq.245");
	       // System.out.println(response.asString());
	        
	       
		
//		RestAssured.baseURI = "http://localhost:3000";
//        given()
//            .param("first_name", "Test")
//            .param("last_name", "Tester")
//            .post("/actor")
//            .then().statusCode(201);
//		
		Response response = given().get("/actor");
		System.out.println(response.asString());
//	
		
	}
	
	//@Test
	public void addActor2() throws IOException {
		File file = new File("/Users/nijataliyev/eclipse-workspace/rest_assured/src/test/java/rest_assured/actor/actor.json"); 
		BufferedReader br = new BufferedReader(new FileReader(file));
		String body = br.readLine();
		System.out.println(body);
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.body(body);
		Response response = request.post("/actor");
		response.then().statusCode(201);
		
	}
	
	

}
