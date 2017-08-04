package com.rort.starline.commons.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class UserDto implements Serializable {

	private static final long serialVersionUID = -1173575546377073696L;

	private Long id;

	private String userName;

	private String passWord;

	private Map<String, List<String>> profile;

	public UserDto(final Long id, final String userName, final String passWord) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
	}

	/**
	 * @return the id
	 */
	public Long getId() {

		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final Long id) {

		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {

		return this.userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(final String userName) {

		this.userName = userName;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {

		return this.passWord;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(final String passWord) {

		this.passWord = passWord;
	}

	/**
	 * @return the profile
	 */
	public Map<String, List<String>> getProfile() {

		return this.profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(final Map<String, List<String>> profile) {

		this.profile = profile;
	}

}
