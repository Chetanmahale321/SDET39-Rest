package ResponseValidation;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {

	@Test
	public void staticResponseGet()
	{
	  //Step 1: Create PreRequisites
		
		String expData = "TY_PROJ_001";
		baseURI = "http://localhost";
		port = 8084;
		
	 // action
		Response resp = when()
		               .get("/projects");
		              
	 // Validation
		String actData = resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("data verified ");
	 // System.out.println(actData);
		
		resp.then().log().all();
		
	}
}
