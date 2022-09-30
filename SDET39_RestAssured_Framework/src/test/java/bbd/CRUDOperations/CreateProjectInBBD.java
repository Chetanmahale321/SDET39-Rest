package bbd.CRUDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import java.util.Random;

import io.restassured.http.ContentType;

public class CreateProjectInBBD {

	@Test
	public void createProject()
	{
		Random ran =new Random();
		int random= ran.nextInt(500);
		
	   baseURI= "http://localhost";
	   port = 8084;
	   
		//Step 1: create pre requisites
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Chetan");
		obj.put("projectName", "SDET39"+random);
		obj.put("status", "Created");
		obj.put("teamSize", 20);
		
		//send the request
		 given()
		   .body(obj)
		    .contentType(ContentType.JSON)
		  .when()
		  .post("/addProject")
		.then()
		    .assertThat().statusCode(201)
		    .log().all();
		 
		  //validate the response
		
	
	}

	}	

