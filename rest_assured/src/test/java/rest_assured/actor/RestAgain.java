package rest_assured.actor;

import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.junit.Test;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.List;
import java.util.Map;

public class RestAgain {
	
	
	//@Test
	public void getAllActors() {
		String response = given().when().get("http://localhost:3000/actor").asString();
		//System.out.println(response);
		JsonPath json = new JsonPath(response);
//		System.out.println(json.getString("$"));
//		System.out.println(json.getString("first_name"));
//		System.out.println(json.get());
//		System.out.println(json.get("[0].first_name"));
		
//		List <String> first_name = json.get("first_name");
//		
//		System.out.println(first_name);
		
//		List <Map<String, Object>> actors = json.get();
//		
//		System.out.println(actors.get(3).get("actor_id"));
//	
	}
	
	//@Test
	public void getAllActors2() {
		given().when().get("http://localhost:3000/actor").then().statusCode(200).
		and().assertThat().body("[0].actor_id", equalTo(2));
		
	}
	
	@Test
	public void getAllActors3() {
		Response response = given().when().get("http://localhost:3000/acto");
//		response.then().log().body();
//		response.then().log().ifStatusCodeIsEqualTo(404);
//		response.then().log().ifError();
		response.then().statusCode(200);
		response.then().body("first_name", hasItems("Nick", "Ed"));
//		.then().statusCode(200).
//		and().assertThat().body("[0].actor_id", equalTo(2));
		
	}
	
	
	
	

}
