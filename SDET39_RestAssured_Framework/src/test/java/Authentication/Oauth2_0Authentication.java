package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_0Authentication {

	@Test
	public void Oauth2()
	{
	   //Step 1:Generate the access token -post
		baseURI ="http://coop.apps.symfonycasts.com";
		
		Response resp = given()
		     .formParam("client_id", "Chetan39")
		     .formParam("client_secret", "57740f5f2fa2dac80cd2854751ce4ff6")
		     .formParam("grant_type", "client_credentials")
		     .formParam("redirect_uri", "http://chetan.com")
		     .formParam("code", "authorization_code")
		     .when()
		     .post("/token");
		 //.then().log().all();
		        
       //Step 2:Capture the token
		String token =resp.jsonPath().get("access_token");
		System.out.println(token);
		
	   //Step 3: use it for other end-points
		given()
		     .pathParam("USER_ID", 3850)
		     .auth()
		          .oauth2(token)
		     .when()
		          .post("/api/{USER_ID}/eggs-collect")
		     .then().log().all();
	}

}