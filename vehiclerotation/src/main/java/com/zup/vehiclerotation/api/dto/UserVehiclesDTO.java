package com.zup.vehiclerotation.api.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.zup.vehiclerotation.api.model.User;

public class UserVehiclesDTO {

	private Long id;
	private String name;
	private String cpf;
	private String email;

	private List<VehicleDTO> vehicles;

	public UserVehiclesDTO() {

	}

	public UserVehiclesDTO(Long id, String name, String cpf, String email, List<VehicleDTO> vehicles) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.vehicles = vehicles;
	}

	public UserVehiclesDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		email = entity.getEmail();
		vehicles = entity.getVehicles().stream().map(vehicle -> new VehicleDTO(vehicle)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<VehicleDTO> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<VehicleDTO> vehicles) {
		this.vehicles = vehicles;
	}

}
