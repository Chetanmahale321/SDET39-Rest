package DifferentWaysToPOST;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONobject {

	
	@Test
	public void createProject()
	{
		Random ran = new Random();
		int random=ran.nextInt(500);
		
		baseURI = "http://localhost";
		   port = 8084;
		
		//Create pre requesites
		JSONObject obj = new JSONObject();
		
		obj.put("createdBy", "Chetan");
		obj.put("projectName", "SDET39"+random);
		obj.put("status", "Created");
		obj.put("teamSize", 20);
		
		//send the request and validate the response
		given()
		   .body(obj)
		   .contentType(ContentType.JSON)
		.when()
		   .post("/addProject")
		.then()
		   .assertThat().statusCode(201).log().all();
		    	
	}
}
