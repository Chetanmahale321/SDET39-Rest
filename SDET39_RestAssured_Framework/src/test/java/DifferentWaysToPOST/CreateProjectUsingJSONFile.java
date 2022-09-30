package DifferentWaysToPOST;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONFile {

	@Test
	public void createProject()
	{
		
		baseURI ="http://localhost";
		port = 8084;
		//create Prerequisites
		File file = new File(".\\data.json1");
		
		//Send Request and validation Response
		given()
		   .body(file)
		   .contentType(ContentType.JSON)
		.when()
		   .post("/addProject")
		.then()
		    .log().all();
		
	}
}
