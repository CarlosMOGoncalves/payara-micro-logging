package pt.test.cmg.rest;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
@RequestScoped
public class TestResource {

    private static final Logger LOGGER = Logger.getLogger(TestResource.class.getName());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response testEndpoint() {
        LOGGER.info("This is an info message");
        LOGGER.warning("This is a warning message");
        LOGGER.severe("This is a severe message");
        return Response.ok().build();
    }

}
