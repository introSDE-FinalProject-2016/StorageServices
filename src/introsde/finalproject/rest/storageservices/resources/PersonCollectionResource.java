package introsde.finalproject.rest.storageservices.resources;

import java.net.MalformedURLException;
import java.net.URL;

import introsde.finalproject.rest.storageservices.util.UrlInfo;
import introsde.finalproject.soap.localdbservices.ws.People;
import introsde.finalproject.soap.localdbservices.ws.Person;
import introsde.finalproject.soap.localdbservices.ws.PersonWrapper;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
@Path("/")
public class PersonCollectionResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	Response response;

	private UrlInfo urlInfo;
	private URL url;
	private String localDBServiceURL = "";

	private Service service;
	private People people;
	private QName qname;

	public PersonCollectionResource() throws MalformedURLException {

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
	 * This function prints a message error into Local Database Service Module
	 * 
	 * @return
	 */
	private String errorMessage() {
		return "{ \n \"error\" : \"Error in LocalDatabaseService\"}";
	}

	/**
	 * This function prints a message error into Storage Service Module
	 * 
	 * @param e
	 * @return
	 */
	private String errorMessage(Exception e) {
		return "{ \n \"error\" : \"Error in Storage Services, due to the exception: "
				+ e + "\"}";
	}

	
	/**
	 * Defines that the next path parameter after the base url is treated as a
	 * parameter and passed to the PersonResources Allows to type
	 * http://localhost:599/base_url/person/idPerson will be treaded as
	 * parameter todo and passed to PersonResource
	 * 
	 * @param id
	 * @return
	 */
	@Path("person/{pid}")
	public PersonResource getPerson(@PathParam("pid") int id) {
		return new PersonResource(uriInfo, request, id, people);
	}

	/**
	 * GET /person 
	 * This method calls a getPersonList method into Local Database 
	 * Services Module
	 * @return
	 */
	@GET
	@Path("person")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPersonList() {
		try {
			System.out.println("getPersonList: Reading all people...");
			/*for(int i=0;i<people.getPersonList().getPerson().size();i++){
				System.out.println(people.getPersonList().getPerson().get(i).toString());
			}*/
			return Response.ok(people.getPersonList().getPerson()).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

	/**
	 * POST /person 
	 * This method calls a createPerson method into Local Database 
	 * Services Module
	 * @param person
	 * @return
	 * @throws IOException
	 */
	@POST
	@Path("person")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createPerson(Person person){
		try {
			System.out.println("createPerson: Creating a new person for "
					+ person.getFirstname() + " and " + person.getLastname() + "...");

			int id = people.createPerson(person, null);
			if (id == -1){
				return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
						.entity(errorMessage()).build();	
			}else{
				return Response.status(Response.Status.CREATED).entity(id)
						.build();
			}	
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

	/**
	 * GET /person/count
	 * This function prints the number of people to get the total number of records
	 * @return a string representing the number of people
	 */
	@GET
	@Path("person/count")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCount() {
		try {
			System.out.println("getCount: Getting count...");
			PersonWrapper result = people.getPersonList();
			int count = result.getPerson().size();
			return Response.ok(String.valueOf(count)).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

}
