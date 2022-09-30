package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetails;
import practice_POJO_SerDes.Spouse;

public class DeserializationUsingObject {

		@Test
		public void DeserializationTest() throws JsonGenerationException, JsonMappingException, IOException
		{
			//Step 1: create object of Object mapper
			ObjectMapper obj = new ObjectMapper();
			
		 int[] arr = {1234,12345};
	   	Spouse spouse = new Spouse("Gayatri", "Capgemini", 123);
			
	      //Step 2: read the value from Object Mapper Class
		   EmployeeDetails emp = obj.readValue(new File(".\\Emp.json"), EmployeeDetails.class);
		    
		  //Step 3: access the value using reference
		    System.out.println(emp.getName());
		    System.out.println(arr[1]);
		    System.out.println(spouse.getSname());
		    emp.setName("SDET");
	}
}
