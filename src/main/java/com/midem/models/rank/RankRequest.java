package com.midem.models.rank;

public class RankRequest {
	
	private Integer idUser;
	private Integer score;
	private String level;
	
	public RankRequest() {}

	public RankRequest(Integer idUser, Integer score, String level) {
		this.idUser = idUser;
		this.score = score;
		this.level = level;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
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

}
