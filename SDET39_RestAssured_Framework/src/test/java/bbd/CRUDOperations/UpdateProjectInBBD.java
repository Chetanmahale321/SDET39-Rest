package bbd.CRUDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class UpdateProjectInBBD {

	
	@Test
	public void UpdateProject()
	{
		 Random ran =new Random();
			int random= ran.nextInt(500);
			
		baseURI= "http://localhost";
		   port = 8084; 
		
		//Step 1: create the data necessary
		JSONObject obj = new JSONObject();
	
		obj.put("createdBy", "Chetan");
		obj.put("projectName", "SDET39-08");
		obj.put("status", "On Going");
		obj.put("teamSize", 12);
		
		//send the request
		 given()
		   .body(obj)
		    .contentType(ContentType.JSON)
		  .when()
		  .put("/projects/TY_PROJ_2007")
		.then()
		    .assertThat().statusCode(200)
		    .log().all();
		 
		  //validate the response
	}	
}
