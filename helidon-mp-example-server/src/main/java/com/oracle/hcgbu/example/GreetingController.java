package com.oracle.hcgbu.example;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.json.Json;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class GreetingController {

    @Inject
    public GreetingController() {
    }

    @GET
    public Response getMessage() {
        return Response.ok().entity(Json.createObjectBuilder()
                .add("message", "Hello!")
                .build()).build();
    }

}