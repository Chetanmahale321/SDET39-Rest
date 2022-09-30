package Authentication;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class BasicAuthontication {
	
	@Test
	public void basicAuthentication()
	{
		baseURI = "http://localhost";
		port = 8084;
		//create PreRequisites
		given()
		    .auth()
		    .basic("rmgyantra", "rmgy@9999")
		 .when()
		    .get("/login")
		  .then()
		     .log().all();
		    
	}
	
	@Test
	public void basicPreEmptiveAuth()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		 .auth().preemptive().basic("rmgyantra", "rmgy@9999")
		 
		 .when()
		 .get("/login")
		 
		.then()
		 .assertThat().statusCode(202).log().all();
	}
	
	@Test
	public void basicDigestiveAuth()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		 .auth().digest("rmgyantra", "rmgy@9999")
		 
		 .when()
		 .get("/login")
		 
		.then()
		 .assertThat().statusCode(202).log().all();
	}

	 //Send the request and validate the response
		    
		    
	}


