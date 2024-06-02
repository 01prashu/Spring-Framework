package com.springcore.p_schema;

public class User {
	private String UserName;
	private String UserCity;
	private String UserId;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getUserCity() {
		return UserCity;
	}
	public void setUserCity(String userCity) {
		this.UserCity = userCity;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		this.UserId = userId;
	}
	@Override
	public String toString() {
		return "User [UserName=" + UserName + ", UserCity=" + UserCity + ", UserId=" + UserId + "]";
	}

	
}
