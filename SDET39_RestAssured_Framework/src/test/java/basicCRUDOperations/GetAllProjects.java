package basicCRUDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetAllProjects {
	
  @Test
	public void getAllProject()
	{
	//Step 1: create pre-condition 
	
	//Step 2: send the request
	Response resp = RestAssured.get("http://localhost:8084/projects");
	
	//Step 3: validate the response
	int expStatus = 200;
	int actStatus = resp.getStatusCode();
	Assert.assertEquals(actStatus, expStatus);
	
	
	}	
}
