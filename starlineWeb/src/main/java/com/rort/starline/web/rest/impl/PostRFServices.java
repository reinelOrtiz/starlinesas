package com.rort.starline.web.rest.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/post")
public class PostRFServices {

	@POST
	@Path("/service/{param}")
	@Consumes(MediaType.TEXT_PLAIN)
	public String postTestService(@PathParam("param") final String param) {

		return "POST Service: " + param;
	}
}
