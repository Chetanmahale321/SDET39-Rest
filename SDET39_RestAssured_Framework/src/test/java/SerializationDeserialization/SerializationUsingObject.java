package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetailsObject;
import practice_POJO_SerDes.Spouse;

public class SerializationUsingObject {
		
	   @Test
		//public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		public void SerializationUsingArray() throws JsonGenerationException, JsonMappingException, IOException {	
			int[] arr = {1234,12345};
			Spouse spouse = new Spouse("Gayatri", "Capgemini", 123);
			
			EmployeeDetailsObject e3 = new EmployeeDetailsObject(3, "Chetan", arr, spouse, "Pune");
			
			ObjectMapper obj = new ObjectMapper();
			
			obj.writeValue(new File("./SampleObject.json"), e3);
		}

}
