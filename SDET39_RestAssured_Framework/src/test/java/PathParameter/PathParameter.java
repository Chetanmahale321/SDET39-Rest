package PathParameter;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class PathParameter {

	@Test
	public void getSingleProject()
	{
		//Pre requisites
		baseURI ="http://localhost";
		port = 8084;
				
		given()
	      .pathParam("pid", "TY_PROJ_2802")
	      
		//Actions
	    .when()
	      .get("/projects/{pid}")
	     // .delete("/projects/{pid}")
	      
		//Validations
	     .then()
	      .assertThat().statusCode(200).log().all();
	}

}
