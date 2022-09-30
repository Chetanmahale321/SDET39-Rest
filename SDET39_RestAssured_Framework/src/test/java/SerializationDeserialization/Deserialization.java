package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetails;

public class Deserialization {

	@Test
	public void deserializationTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		//Step 1: create object of Object mapper
		ObjectMapper obj = new ObjectMapper();
		
      //Step 2: read the value from Object Mapper Class
	   EmployeeDetails emp = obj.readValue(new File(".\\test.json2"), EmployeeDetails.class);
	    
	  //Step 3: acces the value using reference
	    System.out.println(emp.getName());
	    emp.setName("SDET");
}
}