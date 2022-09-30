package PathParameter;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class FormParameter {

	@Test
	public void formParameterTest()
	{
		//Step 1: create pre requisites
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 2: Send the request and validate response
		given()
		  .formParam("createdBy", "Chetan")
		  .formParam("projectName", "SDET-687")
		  .formParam("status", "Completed")
		  .formParam("teamSize", 12)
		  .contentType(ContentType.JSON)
		  
		.when()
		   .post("/addProject")
		.then()
		   .log().all();
	}
}
