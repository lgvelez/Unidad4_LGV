package com.lds;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/servlet")
public class Endpoint {

	@GET
	@Path("/1")
	@Produces("text/plain")
	public String servlet1() {
		return "hola servlet1 ";
	}

	@GET
	@Path("/2")
	@Produces("text/plain")
	public String servlet2() {
		return "hola servlet 2";
	}
	
	@GET
	@Path("/3/{id}")
	@Produces("text/plain")
	public String servlet3( @PathParam("id") String identificador) {
		return "recibe " + identificador;
	}
}
