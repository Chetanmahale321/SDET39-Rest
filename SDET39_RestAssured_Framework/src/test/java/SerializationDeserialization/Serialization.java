package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetails;

public class Serialization {
    
	@Test
	public void SerializationTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		//Step 1: create object of POJO Class
      EmployeeDetails emp = new EmployeeDetails("ChetanMahale1", 123456, "TY123", "Chetan@gmail.com", true);
		
      //Step 2: Create object of ObjectMapper from jacksonMapper
	    ObjectMapper obj = new ObjectMapper();
	    
	  //Step 3: call writeValue method and provide the file path
	    obj.writeValue(new File("./test.json2"),emp);
	    
	}

}
