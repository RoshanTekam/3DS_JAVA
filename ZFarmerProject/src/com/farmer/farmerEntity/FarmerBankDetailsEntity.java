package com.farmerProject.entities.farmerEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class FarmerBankDetailsEntity {
	// Bank Details
	private String bankName;
	private String accountNumber;
	private String ifscCode;

}
