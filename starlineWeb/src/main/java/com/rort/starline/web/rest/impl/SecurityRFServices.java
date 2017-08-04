package com.rort.starline.web.rest.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/security")
public class SecurityRFServices {

	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response authUserApp(@FormParam("username") final String username, @FormParam("password") final String password) {

		try {

			final String token = "usuario: " + username + " psw: " + password;
			return Response.ok(token).build();

		} catch (final Exception e) {
			return Response.status(Response.Status.FORBIDDEN).build();
		}
	}
}
