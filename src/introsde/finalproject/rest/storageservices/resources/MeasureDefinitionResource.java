package introsde.finalproject.rest.storageservices.resources;

import java.net.MalformedURLException;
import java.net.URL;

import introsde.finalproject.rest.storageservices.util.UrlInfo;
import introsde.finalproject.soap.localdbservices.ws.MeasureDefinitionWrapper;
import introsde.finalproject.soap.localdbservices.ws.People;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

@Stateless
@LocalBean
public class MeasureDefinitionResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	private UrlInfo urlInfo;
	private URL url;
	private String localDBServiceURL = "";

	private Service service;
	private People people;
	private QName qname;

	
	/**
	 * initialize the connection with the Local Database Service (LDS)
	 */
	public MeasureDefinitionResource(UriInfo uriInfo, Request request){
		this.uriInfo = uriInfo;
		this.request = request;
		
		this.urlInfo = new UrlInfo();
		this.localDBServiceURL = urlInfo.getLocalDBURL();

		System.out.println("Starting People Service...");
		System.out.println("**STEP 1**");
		System.out.println("WSDL url " + localDBServiceURL
				+ "\n[kill the process to exit]");

		// 1st argument service URI, refer to wsdl document above
		try {
			this.url = new URL(localDBServiceURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println(errorURLMessage(this.url, e));
		}

		// 2nd argument is service name, refer to wsdl document above
		qname = new QName(
				"http://ws.localdbservices.soap.finalproject.introsde/",
				"PeopleService");

		service = Service.create(url, qname);
		people = service.getPort(People.class);
	}

	/**
	 * This functions prints the message error into Storage Services Module
	 * 
	 * @param e
	 * @return
	 */
	private String errorMessage(Exception e) {
		return "{ \n \"error\" : \"Error in Storage Services, due to the exception: "
				+ e + "\"}";
	}
	
	/**
	 * This functions prints the message error URL not valid
	 * 
	 * @param e
	 * @return
	 */
	private String errorURLMessage(URL url, Exception e) {
		return "{ \n \"error\" : \"Error in URL " + url.getPath() + " not valid, due to the exception: "
				+ e + "\"}";
	}
	
	/**
	 * GET /storage-service/measureDefinition 
	 * This method calls a getMeasureDefinitionNames method in
	 * Local Database Services Module
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMeasureDefinition() {
		try {
			System.out.println("getMeasureDefinition(): Reading all names of measures from Local DB Services Module in Storage Services...");
			MeasureDefinitionWrapper result = people
					.getMeasureDefinitionNames();
			return Response.ok(result).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}
}
