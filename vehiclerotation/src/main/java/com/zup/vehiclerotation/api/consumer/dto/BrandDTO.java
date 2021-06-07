package com.zup.vehiclerotation.api.consumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandDTO {

	@JsonProperty("nome")
	private String name;

	@JsonProperty("codigo")
	private String code;

	public BrandDTO() {

	}

	public BrandDTO(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "BrandDTO [name=" + name + ", code=" + code + "]";
	}

}
