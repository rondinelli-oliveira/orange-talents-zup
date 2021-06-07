package com.zup.vehiclerotation.api.dto;

import javax.validation.constraints.NotBlank;

import com.zup.vehiclerotation.api.model.Vehicle;

public class VehicleDTO {

	private Long id;

	@NotBlank(message = "{NotBlank}")
	private String brand;

	@NotBlank(message = "{NotBlank}")
	private String model;

	@NotBlank(message = "{NotBlank}")
	private String year;

	private String price;
	private String noDriveDay;
	private Boolean noDriveDayActive;

	public VehicleDTO() {

	}

	public VehicleDTO(Long id, String brand, String model, String year, String price, String noDriveDay,
			Boolean noDriveDayActive) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
		this.noDriveDay = noDriveDay;
		this.noDriveDayActive = noDriveDayActive;
	}

	public VehicleDTO(Vehicle entity) {
		id = entity.getId();
		brand = entity.getBrand();
		model = entity.getModel();
		year = entity.getYear();
		noDriveDay = entity.getNoDriveDay();
		noDriveDayActive = entity.getNoDriveDayActive();
		price = entity.getPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNoDriveDay() {
		return noDriveDay;
	}

	public void setNoDriveDay(String noDriveDay) {
		this.noDriveDay = noDriveDay;
	}

	public Boolean getNoDriveDayActive() {
		return noDriveDayActive;
	}

	public void setNoDriveDayActive(Boolean noDriveDayActive) {
		this.noDriveDayActive = noDriveDayActive;
	}

}