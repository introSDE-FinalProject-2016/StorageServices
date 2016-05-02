package introsde.finalproject.rest.storageservices.resources;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Stateless
@LocalBean
@Path("/storage-service")
public class CollectionResources {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	
	@Path("/person")
	public PersonResource routePerson() {
		return new PersonResource(uriInfo, request);
	}
	
	@Path("/measureDefinition")
	public MeasureDefinitionResource routeMeasureDefinition() {
		return new MeasureDefinitionResource(uriInfo, request);
	}
	
	@Path("/adapter")
	public AdapterServiceResource routeAdapterService() {
		return new AdapterServiceResource(uriInfo, request);
	}
	
	
	
	
	
	
	
}
