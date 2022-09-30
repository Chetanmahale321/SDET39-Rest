package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ResponseTimeValidation {

	@Test
	public void responseTimeV()
	{
	   //Step 1: Create Prerequisites
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 2: send the request
		//Response resp=
		when()
		     .get("/projects")
		.then()
		     .assertThat().time(Matchers.lessThan(900L));
		//System.out.println(resp.getTime());
		
		//Step 3: validate response
		
	}
}
