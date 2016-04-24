package introsde.finalproject.rest.storageservices.resources;

import introsde.finalproject.rest.storageservices.util.UrlInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

@Stateless
@LocalBean
@Path("/services")
public class AdapterServiceCollectionResource {
	
	@Context
    UrlInfo urlInfo;
	@Context
	Request request;
	
	String adapterServiceURL ="";
	String jsonResponse="";
	
	public AdapterServiceCollectionResource(){
		urlInfo = new UrlInfo();
		adapterServiceURL = urlInfo.getAdapterURL();
	}
	
	/**
	 * Request #1: GET /person/picture 
	 * Returns the list of the pictures from Adapter Services Module 
	 * @return
	 */
	@GET
	@Path("/picture")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPicture(){
		try {
			
			String path = "/instagram-pictures";
			String result_request_1 = "ERROR";
			String mediaType = MediaType.APPLICATION_JSON;
			
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(adapterServiceURL + path);
			HttpResponse response = client.execute(request);
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}

			JSONObject o = new JSONObject(result.toString());

			if (response.getStatusLine().getStatusCode() == 200 && o.getString("status") != "ERROR") {
				
				result_request_1 = "OK";
				
				//jsonResponse += "{\"status\": \"OK\",";
				jsonResponse += "{\"status\": \"" + result_request_1 + "\",";
				
				JSONArray arr = o.getJSONArray("results");
				//System.out.println(arr.toString(4));
				
				int random_hashtag = 0 + (int) (Math.random() * (arr.length() - 1));
				//System.out.println("random_hashtag: " + random_hashtag);
				
				jsonResponse += "\"picture\": {";
				
				String random_tag = arr.getJSONObject(random_hashtag).getString("random_tag");
				String thumbUrl = arr.getJSONObject(random_hashtag).getString("thumbUrl");
				
				jsonResponse += "\"id\": \"" + random_hashtag + "\",";
				jsonResponse += "\"random_tag\": \"" + random_tag + "\",";
				jsonResponse += "\"thumbUrl\": \"" + thumbUrl + "\"";
				
				jsonResponse += "}\n" + "}";
				
				templateRequest(1, "GET", adapterServiceURL + path , response, result_request_1, mediaType);
				System.out.println(prettyJSONPrint(jsonResponse));
				
				return Response.ok(jsonResponse).build();
				
			} else {
				jsonResponse += "{\"status\": \"" + result_request_1 + "\"," 
						+ "\"error\": \"" + response.getStatusLine().getStatusCode() + " " + response.getStatusLine().getReasonPhrase() 
						+ "\"}";

				templateRequest(1, "GET", adapterServiceURL + path , response, result_request_1, mediaType);
				System.out.println(prettyJSONPrint(jsonResponse));
				
				return Response.status(404).entity(jsonResponse).build();
			}
		} catch (Exception e) {
			System.out.println("Error Instagram API external");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}

	}
	
	
	/**
	 * Request #2: GET /person/quote 
	 * Returns one motivational quote from Adapter Service Module 
	 * 
	 * @return
	 * @throws Exception
	 */
	@GET
	@Path("/quote")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getQuote() throws Exception {
		try {
			
			String path = "/motivation-quote";
			String result_request_2 = "ERROR";
			String mediaType = MediaType.APPLICATION_JSON;
			
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(adapterServiceURL + path);
			HttpResponse response = client.execute(request);

			BufferedReader rd = new BufferedReader(new InputStreamReader(response
					.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}

			JSONObject o = new JSONObject(result.toString());

			if (response.getStatusLine().getStatusCode() == 200 && o.getString("status")!="ERROR") {
				
				result_request_2 = "OK";
				
				jsonResponse += "{\"status\": \"" +  result_request_2 + "\",";

				jsonResponse += "\"result\": {";

				String quoteText = o.getJSONObject("result").getString("quote");
				String quoteAuthor = o.getJSONObject("result").getString("author");

				jsonResponse += "\"quote\": \"" + quoteText + "\",";

				if (quoteAuthor != null && !quoteAuthor.isEmpty()) {
					jsonResponse += "\"author\": \"" + quoteAuthor + "\"";
				} else {
					jsonResponse += "\"author\": \"Anonymous\"";
				}

				jsonResponse += "}\n" + "}";

				templateRequest(2, "GET", adapterServiceURL + path , response, result_request_2, mediaType);
				System.out.println(prettyJSONPrint(jsonResponse));
				
				return Response.ok(jsonResponse).build();

			} else {
				jsonResponse += "{\"status\": \"" + result_request_2 + "\"," + 
								  "\"error\": \"" + response.getStatusLine().getStatusCode() + " " + response.getStatusLine().getReasonPhrase() 
								  + "\"}";
				
				templateRequest(2, "GET", adapterServiceURL + path , response, result_request_2, mediaType);
				System.out.println(prettyJSONPrint(jsonResponse));
				
				return Response.status(404).entity(jsonResponse).build();
			}

		} catch (Exception e) {
			System.out.println("Error Quote Design API external");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}
	
	
	
	/**
	 * This function returns a message about to types of the exception found
	 * @param e
	 * @return
	 */
	private String errorMessage(Exception e) {
		return "{ \n \"error\" : \"Error in Adapter Services, due to the exception: "
				+ e + "\"}";
	}
	
	
	/**
	 * This method prints the template for each request
	 * @param numberRequest of the request
	 * @param method of the request
	 * @param path of the request
	 * @param response of the request
	 * @param result of the request
	 * @param mediaType of the request
	 */
	public void templateRequest(int numberRequest, String method, String path, HttpResponse response, String result, String mediaType){
		mediaType = mediaType.toUpperCase();
		System.out.println("======================================================================================================");
		System.out.println("Request #" + numberRequest + ": "+ method + " " + path + " " + "Accept: " + mediaType + " " + "Content-Type: " + mediaType);
		System.out.println("=> Result: " + result);
		System.out.println("=> HTTP Status: " + response.getStatusLine().getStatusCode());
		System.out.println();
	}
	
	/**
	 * This method prints pretty format for JSON
	 * @param jsonString
	 * @return
	 */
	public String prettyJSONPrint(String jsonString){
		JSONObject json = new JSONObject(jsonString); 
		return json.toString(4);	
	}
	
}

