package com.virtusa.microservices.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

//@Path("/")
public class EmptyService {
	
@GET
    @Path("/")
    public String hello() {
        return "Hello World" ;
    }
}
