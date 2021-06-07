package com.zup.vehiclerotation.api.consumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YearDTO {

	@JsonProperty("nome")
	private String name;

	@JsonProperty("codigo")
	private String code;

	public YearDTO() {

	}

	public YearDTO(String name, String code) {
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
		return "YearDTO [name=" + name + ", code=" + code + "]";
	}
}
