package com.farmerProject.entities.farmerEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Farmer")
public class FarmerEntity {
	// personal details
	@Id
	@GeneratedValue
	private long farmerId;
	@Column(name = "farmername")
	private String farmerName;
	private String phoneNumber;
	private String email;

	// Document Upload
	private String aadharCard;
	private String panCard;

	private String password;
	private String confirmPassword;

}