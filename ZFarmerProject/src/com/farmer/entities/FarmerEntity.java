package com.farmer.entities;

public class FarmerEntity {
	// personal details
	private String farmerName;
	private String phoneNumber;
	private String email;
	// Address details
	private String city;
	private String state;
	private String pinCode;
	// land details
	private String area;
	private String landAdd;
	private String landPinCode;
	// Bank Details
	private String accountNumber;
	private String ifscCode;
	// Document Upload
	private String aadharCard;
	private String panCard;

	private String password;
	private String confirmPassword;

	public FarmerEntity(String farmerName, String phoneNumber, String email, String city, String state, String pinCode,
			String area, String landAdd, String landPinCode, String accountNumber, String ifscCode, String aadharCard,
			String panCard, String password, String confirmPassword) {
		super();
		this.farmerName = farmerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.area = area;
		this.landAdd = landAdd;
		this.landPinCode = landPinCode;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.aadharCard = aadharCard;
		this.panCard = panCard;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandAdd() {
		return landAdd;
	}

	public void setLandAdd(String landAdd) {
		this.landAdd = landAdd;
	}

	public String getLandPinCode() {
		return landPinCode;
	}

	public void setLandPinCode(String landPinCode) {
		this.landPinCode = landPinCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "FarmerEntity [farmerName=" + farmerName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", area=" + area + ", landAdd="
				+ landAdd + ", landPinCode=" + landPinCode + ", accountNumber=" + accountNumber + ", ifscCode="
				+ ifscCode + ", aadharCard=" + aadharCard + ", panCard=" + panCard + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}

}
