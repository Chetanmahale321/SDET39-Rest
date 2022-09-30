package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {

	@Test
	public void bearerToken()
	{
		baseURI = "https://api.github.com";
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "SDET39-Rest");
		jobj.put("description", "HybridFW");
		
		given()
		    .auth()
		    .oauth2("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")
		    .body(jobj)
		    .contentType(ContentType.JSON)
		.when()
		     .post("/user/repos")
		.then()
		     .log().all();
				
	}
}
