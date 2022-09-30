package bbd.CRUDOperations;


import static io.restassured.RestAssured.given;
import java.util.Random;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class DeleteProjectUsingBBD {

	@Test
	public void deleteProject()
	{	
    	Random ran =new Random();
		int random= ran.nextInt(500);
		
		baseURI= "http://localhost";
		   port = 8084; 
    //Step 1: create pre requisites
		   
	//Step 2:send the request
	 
	  when()
	  .delete("/projects/TY_PROJ_2405")
	.then()
	    //.assertThat().statusCode(200)
	    .log().all();
	 
	    //validate the response
	}	 
}
