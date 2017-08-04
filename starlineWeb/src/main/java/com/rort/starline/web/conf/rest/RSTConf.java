package com.rort.starline.web.conf.rest;

import com.rort.starline.web.rest.impl.GetRFServices;
import com.rort.starline.web.rest.impl.PostRFServices;
import com.rort.starline.web.rest.impl.SecurityRFServices;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rs")
public class RSTConf extends Application {

	private final Set<Object> singletons = new HashSet<>();
	private final Set<Class<?>> set = new HashSet<>();

	public RSTConf() {
		this.getClasses().add(GetRFServices.class);
		this.getClasses().add(PostRFServices.class);
		this.getClasses().add(SecurityRFServices.class);
	}

	@Override
	public Set<Object> getSingletons() {

		return this.singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {

		return this.set;
	}
}
