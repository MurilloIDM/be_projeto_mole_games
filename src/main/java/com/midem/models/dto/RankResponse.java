package com.midem.models.dto;

public class RankResponse {
	
	private Integer id;
	private Integer score;
	private String level;
	private UserResponse user;
	
	public RankResponse() {}
	
	public RankResponse(Integer id, Integer score, String level, UserResponse user) {
		this.id = id;
		this.score = score;
		this.level = level;
		this.user = user;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getScore() {
		return score;
	}
	
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public UserResponse getUser() {
		return user;
	}
	
	public void setUser(UserResponse user) {
		this.user = user;
	}

}
