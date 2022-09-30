package bbd.CRUDOperations;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAllProjectsInBBD {

	@Test
	public void getAllProject()
	{
		baseURI= "http://localhost";
		   port = 8084;
		   
		 //Step 1: create pre requisites
		   
		 //Step 2:send the request
			  when()
			  .get("/projects")
			.then()
			    .assertThat().statusCode(200)
			    .log().all();
			  
	        //Validate the response
	}
	 
}
