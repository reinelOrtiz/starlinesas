package com.rort.starline.commons.def;

import com.rort.starline.commons.dto.UserDto;
import javax.enterprise.inject.Default;

@Default
public interface ISecurityService {

	public UserDto userAuthentication(final String userName, final String password);
}
