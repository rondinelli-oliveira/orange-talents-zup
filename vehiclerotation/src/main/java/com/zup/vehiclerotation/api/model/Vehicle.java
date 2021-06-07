package com.zup.vehiclerotation.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String brand;

	@Column(nullable = false)
	private String model;

	@Column(nullable = false)
	private String year;

	private String noDriveDay;

	private Boolean noDriveDayActive;

	private String price;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;

	public Vehicle() {

	}

	public Vehicle(Long id, String brand, String model, String year, String noDriveDay, Boolean noDriveDayActive,
			String price, User user) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.noDriveDay = noDriveDay;
		this.noDriveDayActive = noDriveDayActive;
		this.price = price;
		this.user = user;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}