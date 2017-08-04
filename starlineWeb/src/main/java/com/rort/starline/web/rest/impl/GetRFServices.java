package com.rort.starline.web.rest.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/get")
public class GetRFServices {

	@GET
	@Path("/service/{param}")
	@Consumes(MediaType.TEXT_PLAIN)
	public String getTestService(@PathParam("param") final String param) {

		return "GET Service : " + param;
	}
}
