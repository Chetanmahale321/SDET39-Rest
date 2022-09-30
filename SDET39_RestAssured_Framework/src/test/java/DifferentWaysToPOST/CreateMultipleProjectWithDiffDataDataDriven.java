package DifferentWaysToPOST;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import POJOLibraries.ProjectLibrary;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.Random;


public class CreateMultipleProjectWithDiffDataDataDriven {

	@Test(dataProvider="getData")
	public void datadriven(String createdBy, String projectName, String status, int teamSize)
	{
		
		baseURI = "http://localhost";
		port = 8084;
		//prerequisites
		Random ran=new Random();
		int random=ran.nextInt(100);
		ProjectLibrary pLib = new ProjectLibrary(createdBy, projectName+random, status, teamSize);
		
		given()
		.body(pLib)
		.contentType(ContentType.JSON)
		.post("/addProject")
		.then().log().all();
	}

		@DataProvider(name="getData")
		public Object[][] data()
		{
			
			Object[][] obj =new Object[7][4];
			
			obj[0][0]="Chetan-P";
			obj[0][1]="Pune";
			obj[0][2]="Completed";
			obj[0][3]=12;
		
			obj[1][0]="Chetan-M";
			obj[1][1]="Mumbai";
			obj[1][2]="Completed";
			obj[1][3]=12;
		
			obj[2][0]="Chetan-B";
			obj[2][1]="Banglore";
			obj[2][2]="Completed";
			obj[2][3]=12;
		
		
			obj[3][0]="Chetan-C";
			obj[3][1]="Chennai";
			obj[3][2]="Completed";
			obj[3][3]=12;
		
			obj[4][0]="Chetan-G";
			obj[4][1]="Goa";
			obj[4][2]="Completed";
			obj[4][3]=12;
			
			obj[5][0]="Chetan-D";
			obj[5][1]="Dehli";
			obj[5][2]="Completed";
			obj[5][3]=12;
			
			obj[6][0]="Chetan-H";
			obj[6][1]="Hyderabad";
			obj[6][2]="ON GOING";
			obj[6][3]=10;
			
			return obj;
		}	
		
	}

