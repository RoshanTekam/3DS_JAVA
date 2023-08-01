package com.farmer.entities;

public class BidderEntity {
	// personal details
	private String name;
	private String phoneNumber;
	private String email;

	// Address Details
	private String city;
	private String state;
	private String pinCode;

	// Bank Details
	private String accountNumber;
	private String ifscCode;

	// Documetn Details
	private String aadharCard;
	private String panCard;

	private String password;
	private String confirmPassword;

	public BidderEntity(String name, String phoneNumber, String email, String city, String state, String pinCode,
			String accountNumber, String ifscCode, String aadharCard, String panCard, String password,
			String confirmPassword) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.aadharCard = aadharCard;
		this.panCard = panCard;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "BidderEntity [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + ", accountNumber=" + accountNumber + ", ifscCode="
				+ ifscCode + ", aadharCard=" + aadharCard + ", panCard=" + panCard + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}

}
