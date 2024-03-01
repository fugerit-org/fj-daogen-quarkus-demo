package org.fugerit.java.fjdaogenquickstart;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * LoadPerson, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
@Path("/person/load")
@RegisterForReflection( targets =  { LoadPerson.class, LoadPersonHelper.class })
public class LoadPerson extends LoadPersonHelper {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 784750992069L;

	// [HELPER/IMPL MODEL] this class is a stub and can be modified as you see fit (it will not been overwritten)


	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByID(@PathParam( "id") String id) throws Exception {
		logger.info( "load by id {}", id );
		return super.getByID(id);
	}

}
