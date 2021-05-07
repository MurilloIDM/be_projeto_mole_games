package com.midem.models.dto;

public class UserLoginResponse {

	private boolean login;
	private Integer id;
	private String name;
	
	public UserLoginResponse() {}
	
	public UserLoginResponse(boolean login) {
		this.login = login;
	}
	
	public UserLoginResponse(boolean login, Integer id, String name) {
		this.login = login;
		this.id = id;
		this.name = name;
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
