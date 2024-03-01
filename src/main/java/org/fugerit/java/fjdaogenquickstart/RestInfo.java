package org.fugerit.java.fjdaogenquickstart;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperPerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/rest/info")
public class RestInfo {

    private static final Logger logger = LoggerFactory.getLogger( RestInfo.class );

    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getByID(@PathParam( "id") String id) throws Exception {
        logger.info( "load by id {}", id );
        HelperPerson person = new HelperPerson();
        person.setName( "test" );
        person.setNote( "note" );
        return Response.ok().entity( person ).build();
    }

    @GET
    @Path("/ida/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getByIDA(@PathParam( "id") String id) throws Exception {
        logger.info( "load by ida {}", id );
        return Response.ok().entity( id ).build();
    }

    @GET
    @Path("/idb/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getByIDB(@PathParam( "id") String id) throws Exception {
        logger.info( "load by idb {}", id );
        return Response.ok().entity( new SimpleValueRef<String>( id ) ).build();
    }

}
