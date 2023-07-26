package com.staticFinalTest;

public class User {
	private int userId;
	private String flatType;
	private float rent;
	private String location;

	public User(int userId, String flatType, float rent, String location) {
		super();
		this.userId = userId;
		this.flatType = flatType;
		this.rent = rent;
		this.location = location;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFlatType() {
		return flatType;
	}

	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}

	public float getRent() {
		return rent;
	}

	public void setRent(float rent) {
		this.rent = rent;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", flatType=" + flatType + ", rent=" + rent + ", location=" + location + "]";
	}

}
