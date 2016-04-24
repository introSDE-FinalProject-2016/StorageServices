package introsde.finalproject.rest.storageservices.resources;

import introsde.finalproject.soap.localdbservices.ws.Goal;
import introsde.finalproject.soap.localdbservices.ws.GoalWrapper;
import introsde.finalproject.soap.localdbservices.ws.Measure;
import introsde.finalproject.soap.localdbservices.ws.MeasureWrapper;
import introsde.finalproject.soap.localdbservices.ws.People;
import introsde.finalproject.soap.localdbservices.ws.Person;

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

@Stateless
@LocalBean
public class PersonResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	private int idPerson = 0;
	private People people = null;

	public PersonResource(UriInfo uriInfo, Request request, int idPerson) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.idPerson = idPerson;
	}

	public PersonResource(UriInfo uriInfo, Request request, int idPerson,
			People people) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.idPerson = idPerson;
		this.people = people;
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

	// ******************** PERSON ********************

	/**
	 * Get /person/{idPerson} This method calls the getPerson method into Local
	 * Database Services Module
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPerson() {
		try {
			System.out.println("getPerson: Reading person with " + idPerson + "...");
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
	 * PUT /person/{idPerson} This method calls the updatePerson method into
	 * Local Database Services Module
	 * 
	 * @return
	 */
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces(MediaType.APPLICATION_JSON)
	public Response updatePerson(Person person) {
		try {
			System.out.println("updatePerson: Updating person with " + idPerson + "...");
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
	 * DELETE /person/{idPerson} This method calls the deletePerson method into
	 * Local Database Services Module
	 * 
	 * @return
	 */
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Response deletePerson() {
		try {
			System.out.println("deletePerson: Deleting person with " + idPerson + "...");
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
     * GET /person/{idPerson}/historyHealth
     * This method calls a getHistoryHealth method in Local Database Services Module 
     * @return
     */
    @GET
    @Path("/historyHealth")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getHistoryHealth() {
    	try{
    		System.out.println("getHistoryHealth: Reading historyHealth for a person with " + idPerson + "...");
    		MeasureWrapper result =  people.getHistoryHealth(idPerson);
    		return Response.ok(result).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
	
	
	// ******************** GOAL ********************

	/**
	 * GET /person/{idPerson}/goal This method calls the getGoalList method into
	 * Local Database Services Module
	 * 
	 * @return
	 */
	@GET
	@Path("/goal")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGoalList() {
		try {
			System.out.println("getGoalList: Reading all goals for a person with " + idPerson + "...");
			GoalWrapper result = people.getGoalList(idPerson);
			return Response.ok(result).build();
		} catch (Exception e) {
			System.out.println("Error in Storage Services");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage(e)).build();
		}
	}

	/**
	 * POST /person/{idPerson}/goal This method calls the createGoal method into
	 * Local Database Services Module
	 * 
	 * @param goal
	 * @return
	 */
	@POST
	@Path("goal")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces(MediaType.APPLICATION_JSON)
	public Response createGoal(Goal goal) {
		try {
			System.out.println("createGoal: Creating a new goal for " + goal.getType()
					+ ", " + idPerson + "...");
			int id = this.people.createGoal(goal, this.idPerson);

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
	 * PUT /person/{idPerson}/goal/{idGoal} This method calls the updateGoal
	 * method into Local Database Services Module
	 * 
	 * @param goal
	 * @param idGoal
	 * @return
	 */
	@PUT
	@Path("/goal/{gid}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateGoal(Goal goal, @PathParam("gid") int idGoal) {
		try {
			System.out.println("updateGoal: Updating goal with " + idGoal + " for a person with " + idPerson + "...");
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
	 * DELETE /person/{idPerson}/goal/{idGoal} This method calls the deleteGoal
	 * method into Local Database Services Module
	 * 
	 * @param targetId
	 * @return
	 */
	@DELETE
	@Path("/goal/{gid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteGoal(@PathParam("gid") int idGoal) {
		try {
			System.out.println("deleteGoal: Deleting goal with " + idGoal + " for a person with " + idPerson + "...");
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
	 * GET /person/{idPerson}/goal/{measureName}
	 * This method calls the getGoal
	 * method into Local Database Services Module
	 * @param measureName
	 * @return
	 */
	@GET
    @Path("/goal/{measureName}")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getGoal(@PathParam("measureName") String measureName) {
    	try{
    		System.out.println("getGoal: Reading goals for " + measureName + " for a person with " + idPerson + "...");
    		GoalWrapper result = people.getGoal(idPerson, measureName);
    		return Response.ok(result).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
	
	// ******************** MEASURE ********************
	
	 /**
     * GET /person/{idPerson}/measure/{measureName}
     * This method calls a getMeasure method in Local Database Services Module
     * @return
     */
    @GET
    @Path("/measure/{measureName}")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getMeasure(@PathParam("measureName") String measureName) {
    	try{
    		System.out.println("getMeasure: Reading all measures for " + measureName + " for a person with " + idPerson + "...");
    		MeasureWrapper result = people.getMeasure(idPerson, measureName);
    		return Response.ok(result).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
	
	/**
     * POST /person/{idPerson}/measure
     * This method calls a createMeasure method in Local Database Services Module
     * @param measure
     * @return
     */
    @POST
	@Path("/measure")
    @Produces( MediaType.APPLICATION_JSON )
    @Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML})
    public Response createMeasure(Measure measure){
    	try{
    		System.out.println("createMeasure: Creating a new measure for " + measure.getName() + " for a person with " + idPerson + "...");
    		
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
     * PUT /person/{idPerson}/measure/{idMeasure}
     * This method calls a updateMeasure method in Local Database Services Module
     * @param measure
     * @param measureId
     * @return
     * @throws ParseException_Exception
     */
    @PUT
    @Path("/measure/{mid}")
    @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Produces( MediaType.APPLICATION_JSON )
	public Response updateMeasure(Measure measure, @PathParam("mid") int idMeasure){
    	try{
    		System.out.println("updateMeasure: Updating a measure with " + idMeasure + " for a person with " + idPerson + "...");
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
     * DELETE /person/{idPerson}/measure/{idMeasure}
     * This methods calls a deleteMeasure method in Local Database Services Module
     * @param measureId
     * @return
     */
    @DELETE
    @Path("/measure/{mid}")
    @Produces( MediaType.APPLICATION_JSON )
    public Response deleteMeasure(@PathParam("mid") int idMeasure) {
    	try{
    		System.out.println("deleteMeasure: Deleting a measure with " + idMeasure + " for a person with " + idPerson);
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
