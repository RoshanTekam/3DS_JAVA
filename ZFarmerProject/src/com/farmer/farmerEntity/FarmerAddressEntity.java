package com.farmerProject.entities.farmerEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class FarmerAddressEntity {
	// Address details
	private String city;
	private String state;
	private String pinCode;

}
