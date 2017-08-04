package com.rort.starline.web.rest.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rort.starline.web.services.SecurityFacade;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/security")
public class SecurityRFServices {

	@Inject
	private SecurityFacade sercurity;

	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response authUserApp(@FormParam("username") final String userName, @FormParam("password") final String password) {

		try {

			final ObjectMapper mapper = new ObjectMapper();
			final String user = mapper.writeValueAsString(this.sercurity.userAuthentication(userName, password));
			return Response.ok(user).build();

		} catch (final Exception e) {
			return Response.status(Response.Status.FORBIDDEN).build();
		}
	}
}
