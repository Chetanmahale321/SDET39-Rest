package DifferentWaysToPOST;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Random;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class CreateProjectUsingHashMap {

	@Test
	public void createProject()
	{
	  Random ran =new Random();
	  //int random =ran.nextInt(500);
	  
	  baseURI = "http://localhost";
	  port = 8084;
	  //Create pre requesites
	  HashMap map=new HashMap();
	    map.put("createdBy", "Chetan");
	    map.put("projectName", "SDET39"+ran);
	    map.put("status", "Created");
	    map.put("teamSize", 10);
	    
	    //Send the request and validate
	    given()
	       .body(map)
	       .contentType(ContentType.JSON)
	    .when()
	       .post("/addProject")  
	    .then()
	         .assertThat().statusCode(201).log().all();
	}
}
