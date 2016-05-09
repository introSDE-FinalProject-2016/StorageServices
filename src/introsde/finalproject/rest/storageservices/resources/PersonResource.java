package introsde.finalproject.rest.storageservices.resources;

import java.net.MalformedURLException;
import java.net.URL;

import introsde.finalproject.rest.storageservices.util.UrlInfo;
import introsde.finalproject.soap.localdbservices.ws.Goal;
import introsde.finalproject.soap.localdbservices.ws.GoalWrapper;
import introsde.finalproject.soap.localdbservices.ws.Measure;
import introsde.finalproject.soap.localdbservices.ws.MeasureWrapper;
import introsde.finalproject.soap.localdbservices.ws.People;
import introsde.finalproject.soap.localdbservices.ws.PeopleService;
import introsde.finalproject.soap.localdbservices.ws.Person;
import introsde.finalproject.soap.localdbservices.ws.PersonWrapper;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
public class PersonResource {

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
	public PersonResource(UriInfo uriInfo, Request request){
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
			url = new URL(localDBServiceURL);
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
	 * This functions prints the message error into Local Database Services
	 * Module
	 * 
	 * @return
	 */
	private String errorMessage() {
		return "{ \n \"error\" : \"Error in LocalDatabaseServices\"}";
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
	 * This function prints the message not found if the person with id didn't
	 * find
	 * 
	 * @param name
	 * @param id
	 * @return
	 */
	private String notFoundMessage(String name, int id) {
		return "{ \n \"error\" : \"" + name + " with id = " + id
				+ " not found\" \n }";
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
	
	
	// ******************** PERSON ********************

	/**
	 * GET /storage-service/person 
	 * This method calls a getPersonList method into Local Database 
	 * Services Module
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPersonList() {
		try {
			System.out.println("getPersonList: Reading all people from Local DB Services Module in Storage Services...");
			 PersonWrapper personList = people.getPersonList();
			return Response.ok(personList.getPerson().toString()).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}
	
	/**
	 * Get /storage-service/person/{idPerson} This method calls the getPerson method into Local
	 * Database Services Module
	 * 
	 * @return
	 */
	@GET
	@Path("{pid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPerson(@PathParam("pid") int idPerson) {
		try {
			System.out.println("getPerson: Reading person with " + idPerson + " from Local DB Services Module in Storage Services...");
			
			Person person = people.getPerson(idPerson);
			if (person == null) {
				return Response.status(Response.Status.NOT_FOUND)
						.entity(notFoundMessage("Person", idPerson)).build();
			} else {
				System.out.println("Found Person by id = " + idPerson + " => "
						+ person.getFirstname());
				return Response.ok(person).build();
			}
		} catch (Exception e) {
			System.out.println("Error in Storage Services");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

	/**
	 * POST /storage-service/person 
	 * This method calls a createPerson method into Local Database 
	 * Services Module
	 * @param person
	 * @return
	 * @throws IOException
	 */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createPerson(Person person){
		try {
			System.out.println("createPerson: Creating a new person for "
					+ person.getFirstname() + " " + person.getLastname() + " from Local DB Services Module in Storage Services...");

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
	 * GET /storage-service/person/count
	 * This function prints the number of people to get the total number of records
	 * @return a string representing the number of people
	 */
	@GET
	@Path("count")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCount() {
		try {
			System.out.println("getCount: Getting count in Storage Services...");
			
			PersonWrapper result = people.getPersonList();
			int count = result.getPerson().size();
			return Response.ok(String.valueOf(count)).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}
	
	
	/**
	 * PUT /storage-service/person/{idPerson} This method calls the updatePerson method into
	 * Local Database Services Module
	 * 
	 * @return
	 */
	@PUT
	@Path("{pid}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces(MediaType.APPLICATION_JSON)
	public Response updatePerson(@PathParam("pid") int idPerson, Person person) {
		try {
			System.out.println("updatePerson: Updating person with " + idPerson + " from Local DB Services Module in Storage Services...");
			
			person.setPid(idPerson);
			int result = people.updatePerson(person);
			if (result >= 0) {
				return Response.ok(result).build();
			} else if (result == -2) {
				return Response.status(Response.Status.NOT_FOUND)
						.entity(notFoundMessage("Person", idPerson)).build();
			} else {
				return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
						.entity(errorMessage()).build();
			}
		} catch (Exception e) {
			System.out.println("Error in Storage Services");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

	/**
	 * DELETE /storage-service/person/{idPerson} This method calls the deletePerson method into
	 * Local Database Services Module
	 * 
	 * @return
	 */
	@DELETE
	@Path("{pid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deletePerson(@PathParam("pid") int idPerson) {
		try {
			System.out.println("deletePerson: Deleting person with " + idPerson + " from Local DB Services Module in Storage Services...");
			
			int result = people.deletePerson(idPerson);
			if (result == -1) {
				return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
						.entity(errorMessage()).build();

			} else if (result == -2) {
				return Response.status(Response.Status.NOT_FOUND)
						.entity(notFoundMessage("Person", idPerson)).build();
			} else {
				return Response.status(Response.Status.NO_CONTENT).build();
			}
		} catch (Exception e) {
			System.out.println("Error in Storage Services");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

	 /**
     * GET /storage-service/person/{idPerson}/historyHealth
     * This method calls a getHistoryHealth method in Local Database Services Module 
     * @return
     */
    @GET
    @Path("{pid}/historyHealth")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getHistoryHealth(@PathParam("pid") int idPerson) {
    	try{
    		System.out.println("getHistoryHealth: Reading historyHealth for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
    		
    		MeasureWrapper result =  people.getHistoryHealth(idPerson);
    		return Response.ok(result).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
	
	
	// ******************** GOAL ********************

	/**
	 * GET /storage-service/person/{idPerson}/goal This method calls the getGoalList method into
	 * Local Database Services Module
	 * 
	 * @return
	 */
	@GET
	@Path("{pid}/goal")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGoalList(@PathParam("pid") int idPerson) {
		try {
			System.out.println("getGoalList: Reading all goals for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
			
			GoalWrapper result = people.getGoalList(idPerson);
			return Response.ok(result).build();
		} catch (Exception e) {
			System.out.println("Error in Storage Services");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

	/**
	 * POST /storage-service/person/{idPerson}/goal This method calls the createGoal method into
	 * Local Database Services Module
	 * 
	 * @param goal
	 * @return
	 */
	@POST
	@Path("{pid}/goal")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces(MediaType.APPLICATION_JSON)
	public Response createGoal(@PathParam("pid") int idPerson, Goal goal) {
		try {
			System.out.println("createGoal: Creating a new goal for " + goal.getType()
					+ ", for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
			
			int id = people.createGoal(goal, idPerson);

			if (id == -1) {
				return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
						.entity(errorMessage()).build();
			} else {
				return Response.status(Response.Status.CREATED).entity(id)
						.build();
			}

		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

	/**
	 * PUT /storage-service/person/{idPerson}/goal/{idGoal} This method calls the updateGoal
	 * method into Local Database Services Module
	 * 
	 * @param goal
	 * @param idGoal
	 * @return
	 */
	@PUT
	@Path("{pid}/goal/{gid}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateGoal(@PathParam("pid") int idPerson, Goal goal, @PathParam("gid") int idGoal) {
		try {
			System.out.println("updateGoal: Updating goal with " + idGoal + ", for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
			goal.setGid(idGoal);
			
			int result = people.updateGoal(goal);
			if (result >= 0)
				return Response.ok(result).build();
			else if (result == -2)
				return Response.status(Response.Status.NOT_FOUND)
						.entity(notFoundMessage("Goal", idGoal)).build();
			else
				return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
						.entity(errorMessage()).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

	/**
	 * DELETE /storage-service/person/{idPerson}/goal/{idGoal} This method calls the deleteGoal
	 * method into Local Database Services Module
	 * 
	 * @param targetId
	 * @return
	 */
	@DELETE
	@Path("{pid}/goal/{gid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteGoal(@PathParam("pid") int idPerson, @PathParam("gid") int idGoal) {
		try {
			System.out.println("deleteGoal: Deleting goal with " + idGoal + ", for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
			
			int result = people.deleteGoal(idGoal);
			if (result == -1)
				return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
						.entity(errorMessage()).build();
			else if (result == -2)
				return Response.status(Response.Status.NOT_FOUND)
						.entity(notFoundMessage("Goal", idGoal)).build();
			else
				return Response.status(Response.Status.NO_CONTENT).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}
	
	/**
	 * GET /storage-service/person/{idPerson}/goal/{measureName}
	 * This method calls the getGoal
	 * method into Local Database Services Module
	 * @param measureName
	 * @return
	 */
	@GET
    @Path("{pid}/goal/{measureName}")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getGoal(@PathParam("pid") int idPerson, @PathParam("measureName") String measureName) {
    	try{
    		System.out.println("getGoal: Reading goals for " + measureName + ", for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
    		
    		GoalWrapper result = people.getGoal(idPerson, measureName);
    		return Response.ok(result).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
	
	// ******************** MEASURE ********************
	
	 /**
     * GET /storage-service/person/{idPerson}/measure/{measureName}
     * This method calls a getMeasure method in Local Database Services Module
     * @return
     */
    @GET
    @Path("{pid}/measure/{measureName}")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getMeasure(@PathParam("pid") int idPerson, @PathParam("measureName") String measureName) {
    	try{
    		System.out.println("getMeasure: Reading all measures for " + measureName + ", for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
    		
    		MeasureWrapper result = people.getMeasure(idPerson, measureName);
    		return Response.ok(result).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
	
	/**
     * POST /storage-service/person/{idPerson}/measure
     * This method calls a createMeasure method in Local Database Services Module
     * @param measure
     * @return
     */
    @POST
	@Path("{pid}/measure")
    @Produces( MediaType.APPLICATION_JSON )
    @Consumes({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
    public Response createMeasure(@PathParam("pid") int idPerson, Measure measure){
    	try{
    		System.out.println("createMeasure: Creating a new measure for " + measure.getName() + ", for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
    		
    		int id = people.createMeasure(measure, idPerson);
    		if(id == -1)
    			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage()).build();
    		else
    			return Response.status(Response.Status.CREATED).entity(id).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
    
    /**
     * PUT /storage-service/person/{idPerson}/measure/{idMeasure}
     * This method calls a updateMeasure method in Local Database Services Module
     * @param measure
     * @param measureId
     * @return
     * @throws ParseException_Exception
     */
    @PUT
    @Path("{pid}/measure/{mid}")
    @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Produces( MediaType.APPLICATION_JSON )
	public Response updateMeasure(@PathParam("pid") int idPerson, Measure measure, @PathParam("mid") int idMeasure){
    	try{
    		System.out.println("updateMeasure: Updating a measure with " + idMeasure + ", for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
    		
    		measure.setMid(idMeasure);
    		int result = people.updateMeasure(measure);    
    		if (result >= 0)
    			return Response.ok(result).build();
    		else if (result == -2)
    			return Response.status(Response.Status.NOT_FOUND)
    				.entity(notFoundMessage("Measure", idMeasure)).build();
    		else
    			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage()).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
    
       
    /**
     * DELETE /storage-service/person/{idPerson}/measure/{idMeasure}
     * This methods calls a deleteMeasure method in Local Database Services Module
     * @param measureId
     * @return
     */
    @DELETE
    @Path("{pid}/measure/{mid}")
    @Produces( MediaType.APPLICATION_JSON )
    public Response deleteMeasure(@PathParam("pid") int idPerson, @PathParam("mid") int idMeasure) {
    	try{
    		System.out.println("deleteMeasure: Deleting a measure with " + idMeasure + ", for a person with " + idPerson + " from Local DB Services Module in Storage Services...");
    		
    		int result = people.deleteMeasure(idMeasure);
    		if (result == -1)
    			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage()).build();
    		else if (result == -2)
    			return Response.status(Response.Status.NOT_FOUND)
    				.entity(notFoundMessage("Measure", idMeasure)).build();
    		else
    			return Response.status(Response.Status.NO_CONTENT).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
}
