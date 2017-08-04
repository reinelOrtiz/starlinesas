package com.rort.starline.web.services;

import com.rort.starline.commons.def.ISecurityService;
import com.rort.starline.commons.dto.UserDto;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class SecurityFacade {

	@Inject
	private ISecurityService securityService;

	public UserDto userAuthentication(final String userName, final String password) {

		return this.securityService.userAuthentication(userName, password);
	}

}
