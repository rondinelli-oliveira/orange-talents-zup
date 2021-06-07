package com.zup.vehiclerotation.api.consumer.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelListDTO {

	@JsonProperty("modelos")
	List<ModelDTO> models;

	public ModelListDTO() {

	}

	public ModelListDTO(List<ModelDTO> models) {
		this.models = models;
	}

	public List<ModelDTO> getModels() {
		return models;
	}

	@Override
	public String toString() {
		return "ModelListDTO [models=" + models + "]";
	}

}
