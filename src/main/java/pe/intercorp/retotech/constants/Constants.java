package pe.intercorp.retotech.constants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

public class Constants {
	 
	public final static int DECIMALS = 2;  
	
	public static final Contact DEFAULT_CONTACT = new Contact(
			"Gilmar Lam", 
			"https://gilmarlam.pe", 
			"gilmarlamt@gmail.com");
	
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
			"Client API Documentation", 
			"Swagger contract RESTful Web Service API", 
			"v1", 
			"urn:pe.intercorp.retotech",
			DEFAULT_CONTACT, 
			"", 
			"");
	
	public static final Set<String> DEFAULT_PRODUCES_AND_CONSUMERS = new HashSet<String>(Arrays.asList("application/json"));
	
	private Constants() {
    }
	 
}
