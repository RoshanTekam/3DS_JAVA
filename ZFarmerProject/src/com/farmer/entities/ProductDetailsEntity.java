package com.farmer.entities;

import java.awt.Image;

public class ProductDetailsEntity {
	private String cropType;
	private String cropName;
	private String fertilizerType;
	private String quntity;

	private Image soilpHCertificate;

	public ProductDetailsEntity(String cropType, String cropName, String fertilizerType, String quntity,
			Image soilpHCertificate) {
		super();
		this.cropType = cropType;
		this.cropName = cropName;
		this.fertilizerType = fertilizerType;
		this.quntity = quntity;
		this.soilpHCertificate = soilpHCertificate;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getFertilizerType() {
		return fertilizerType;
	}

	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}

	public String getQuntity() {
		return quntity;
	}

	public void setQuntity(String quntity) {
		this.quntity = quntity;
	}

	public Image getSoilpHCertificate() {
		return soilpHCertificate;
	}

	public void setSoilpHCertificate(Image soilpHCertificate) {
		this.soilpHCertificate = soilpHCertificate;
	}

	@Override
	public String toString() {
		return "ProductDetailsEntity [cropType=" + cropType + ", cropName=" + cropName + ", fertilizerType="
				+ fertilizerType + ", quntity=" + quntity + ", soilpHCertificate=" + soilpHCertificate + "]";
	}

}
