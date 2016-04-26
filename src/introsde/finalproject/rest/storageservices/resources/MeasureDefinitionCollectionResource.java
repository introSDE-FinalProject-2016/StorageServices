package introsde.finalproject.rest.storageservices.resources;

import java.net.MalformedURLException;
import java.net.URL;

import introsde.finalproject.rest.storageservices.util.UrlInfo;
import introsde.finalproject.soap.localdbservices.ws.MeasureDefinitionWrapper;
import introsde.finalproject.soap.localdbservices.ws.People;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

@Stateless
// will work only inside a Java EE application
@LocalBean
// will work only inside a Java EE application
@Path("/measureNames")
public class MeasureDefinitionCollectionResource {

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

	public MeasureDefinitionCollectionResource() throws MalformedURLException {

		urlInfo = new UrlInfo();
		localDBServiceURL = urlInfo.getLocalDBURL();

		System.out.println("Starting People Service...");
		System.out.println("**STEP 1**");
		System.out.println("WSDL url " + localDBServiceURL
				+ "\n[kill the process to exit]");

		// 1st argument service URI, refer to wsdl document above
		url = new URL(localDBServiceURL);

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
	 * GET /measureTypes This method calls a getMeasureDefinitionNames method in
	 * Local Database Services Module
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMeasureDefinition() {
		try {
			System.out.println("getMeasureDefinition(): Reading names of all measures...");
			MeasureDefinitionWrapper result = people
					.getMeasureDefinitionNames();
			return Response.ok(result).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}
}
