package com.rort.starline.commons.impl;

import com.rort.starline.commons.def.ISecurityService;
import com.rort.starline.commons.dto.UserDto;
import javax.ejb.Stateless;

@Stateless
public class SecurityService implements ISecurityService {

	@Override
	public UserDto userAuthentication(final String userName, final String password) {

		try {

			if ("roma".equals(userName) && "123".equals(password)) {
				final UserDto user = new UserDto(11L, "roma", "123");
				return user;
			}
			return null;

		} catch (final Exception e) {
			return null;
		}
	};
}
