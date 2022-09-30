package DifferentWaysToPOST;

import org.testng.annotations.Test;

import POJOLibraries.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectUsingPOJO {

	@Test
	public void createProject()
	{
		baseURI ="http://localhost";
		port = 8084;
		
		Random ran = new Random();
		
		//Create Prerequisites
		ProjectLibrary pLib= new ProjectLibrary("Chetan", "Xlem"+ran.nextInt(100), "Created", 20);
		
		//Send request and validate
		given()
		    .body(pLib)
		    .contentType(ContentType.JSON)
		 .when()
		     .post("/addProject")
		 .then()
		     .log().all();  
		
	}
}
