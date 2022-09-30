package basicCRUDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {

	@Test
	public void UpdateProject()
	{
	
		//Step 1: create the data necessary
		JSONObject obj = new JSONObject();
	
		obj.put("createdBy", "Chetan");
		obj.put("projectName", "SDET39-08");
		obj.put("status", "Completed");
		obj.put("teamSize", 12);
		
		//Step 2: send the request
		RequestSpecification req =RestAssured.given();
		
		req.body(obj);
		req.contentType(ContentType.JSON);
		    
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_2003");
		
		//Step 3: Validate the response
		System.out.println(resp.getStatusCode());
	}	
}
