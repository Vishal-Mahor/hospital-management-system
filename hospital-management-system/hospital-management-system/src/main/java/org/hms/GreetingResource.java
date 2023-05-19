package org.hms;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/name")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String achal() {
        return "Hello from hms";
    }

    @POST
    @Path("Achal")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "hello achal";
    }
}
