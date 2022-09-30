package PathParameter;

	import static io.restassured.RestAssured.*;
	import java.util.Random;
	import org.testng.annotations.Test;
	import POJOLibraries.ProjectLibrary;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;

	public class CreateProjectGetProjectAndDelete {
		
		@Test
		public void createAndGetAndDelete()
		{
			Random ran =new Random();
			
		//Create Prerequisites for POST
		  baseURI ="http://localhost";
		 port = 8084;
		 
		ProjectLibrary pLib = new ProjectLibrary("Chetan", "Amdocs"+ran.nextInt(100), "completed", 12);
			
		//Step 2: Send the POST request
		Response resp = given()
		              .body(pLib)
		              .contentType(ContentType.JSON)
		              .when()
		              .post("/addProject");
		 //.then().log().all();
		      
		 //Step 3:Capture the project ID writing json Path
		String projectID = resp.jsonPath().get("projectId");
		System.out.println(projectID);
		
		//Step 4: Send the get request with project ID
		given()
		    .pathParam("pid", projectID)
		.when()
		    .get("/projects/{pid}")
		    //.get("/projects/"+projectID)
		  .then()
		     .assertThat().statusCode(200).log().all();
		
		   given()
	          .pathParam("pid", projectID)
	       .when()
	          .delete("/projects/{pid}")
	       .then()
			  .assertThat().statusCode(204).log().all();
		 	
		}

}
