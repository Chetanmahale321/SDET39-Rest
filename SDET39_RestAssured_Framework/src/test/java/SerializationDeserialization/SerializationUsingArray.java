package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetailsArray;

public class SerializationUsingArray {

	    @Test
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		//public void SerializationUsingArray() throws JsonGenerationException, JsonMappingException, IOException {
			int[] arr = {123,12345};
			EmployeeDetailsArray emp2 = new EmployeeDetailsArray(2, "Chetan", arr, "Pune");
			
			ObjectMapper obj = new ObjectMapper();
			
			obj.writeValue(new File(".//SampleArray.json"), emp2);
		}
		
}
