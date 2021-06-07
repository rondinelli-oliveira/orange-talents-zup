package com.zup.vehiclerotation.api.consumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelDTO {

	@JsonProperty("nome")
	private String name;

	@JsonProperty("codigo")
	private Long code;

	public ModelDTO() {

	}

	public ModelDTO(String name, Long code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Long getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "ModelDTO [name=" + name + ", code=" + code + "]";
	}
}
