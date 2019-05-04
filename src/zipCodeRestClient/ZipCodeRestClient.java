package zipCodeRestClient;

import org.springframework.core.NestedRuntimeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class ZipCodeRestClient {
	
	private static void getEmployees() throws NestedRuntimeException
	{
	    final String uri = "http://localhost:8080/Get?zipCodeList=75024,81223,99999";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = null;
		try {
			result = restTemplate.getForObject(uri, String.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	     
	    System.out.println(result);
	}
	
	public static void main(String a[]){
		ZipCodeRestClient zipCodeRestClient = new ZipCodeRestClient();
		zipCodeRestClient.getEmployees();
	}

}
