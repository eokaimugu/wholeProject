package jsonProject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONFile {

	public static void main(String[] args) throws IOException, ParseException {
		
		
	JSONParser	jp = new JSONParser();
	FileReader reader = new FileReader(".\\jsonFiles\\employees.json");	 
	
	Object obj = jp.parse(reader);  //returns a java object
		JSONObject empjsonobj = (JSONObject)obj;  //Type cast the java object to a JSONOBJECT
	String lname = (String) empjsonobj.get("lastName");  // String casting----> converts the JSONOBJECT to a string object
	String fname = (String) empjsonobj.get("firstName");
	
	System.out.println(fname+" "+ lname);
	
	JSONArray arr = (JSONArray)empjsonobj.get("address");  //Type cast the address key with a JSONArray
	
	for(int i=0; i<arr.size(); i++) {
		
		JSONObject address = (JSONObject)arr.get(i);
		String street = (String)address.get("street");
		String city = (String)address.get("city");
		String state = (String)address.get("state");
		
		System.out.println(street+" "+city+" " +state);
	}
	
	
	}

}
