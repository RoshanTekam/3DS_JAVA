package com.staticFinalTest;

public class FlatOwner {

	private String flatType;
	private String location;
	final float rentCharge;

	public FlatOwner(String flatType, String location, float rentCharge) {
		super();
		this.flatType = flatType;
		this.location = location;
		this.rentCharge = rentCharge;
	}

	public String getFlatType() {
		return flatType;
	}

	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getRentCharge() {
		return rentCharge;
	}

	@Override
	public String toString() {
		return "FlatOwner [flatType=" + flatType + ", location=" + location + ", rentCharge=" + rentCharge + "]";
	}

}
