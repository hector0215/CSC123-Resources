import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.net.URI;

public class APIClientDemo {

	public static void main(String[] args) throws Exception {
		
		//Step 1
		HttpRequest.Builder builder=HttpRequest.newBuilder();
		builder.uri(URI.create("https://www.google.com"));

		builder.method("GET", HttpRequest.BodyPublishers.noBody());
		
		//Step 2
		HttpRequest req=builder.build();
		
		
			
		//Step 3
		
		HttpClient client=HttpClient.newHttpClient();
						
		//Step 4
		
		HttpResponse<String> response = 
				client.send(req, HttpResponse.BodyHandlers.ofString());
		
		//Step 5
		System.out.println(response.headers().toString());
		System.out.println(response.body());

	
	}

}
