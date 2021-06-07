package com.zup.vehiclerotation.api.consumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleDTO {

	@JsonProperty("Valor")
	private String price;

	@JsonProperty("Marca")
	private String brand;

	@JsonProperty("Modelo")
	private String model;

	@JsonProperty("AnoModelo")
	private String year;

	@JsonProperty("Combustivel")
	private String fuel;

	@JsonProperty("CodigoFipe")
	private String fipeCode;

	@JsonProperty("MesReferencia")
	private String referenceMonth;

	@JsonProperty("TipoVeiculo")
	private String type;

	@JsonProperty("SiglaCombustivel")
	private String fuelInitial;

	public VehicleDTO() {

	}

	public VehicleDTO(String price, String brand, String model, String year, String fuel, String fipeCode,
			String referenceMonth, String type, String fuelInitial) {
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.fuel = fuel;
		this.fipeCode = fipeCode;
		this.referenceMonth = referenceMonth;
		this.type = type;
		this.fuelInitial = fuelInitial;
	}

	public String getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}

	public String getFuel() {
		return fuel;
	}

	public String getFipeCode() {
		return fipeCode;
	}

	public String getReferenceMonth() {
		return referenceMonth;
	}

	public String getType() {
		return type;
	}

	public String getFuelInitial() {
		return fuelInitial;
	}

	@Override
	public String toString() {
		return "VehicleDTO [price=" + price + ", brand=" + brand + ", model=" + model + ", year=" + year + ", fuel="
				+ fuel + ", fipeCode=" + fipeCode + ", referenceMonth=" + referenceMonth + ", type=" + type
				+ ", fuelInitial=" + fuelInitial + "]";
	}
}
