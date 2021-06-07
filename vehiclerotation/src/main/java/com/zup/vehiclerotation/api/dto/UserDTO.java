package com.zup.vehiclerotation.api.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.zup.vehiclerotation.api.model.User;

public class UserDTO {

	private Long id;

	@NotBlank(message = "{NotBlank}")
	private String name;

	@NotBlank(message = "{NotBlank}")
	private String cpf;

	@NotBlank(message = "{NotBlank}")
	@Email(message = "{Email}")
	private String email;

	public UserDTO() {

	}

	public UserDTO(Long id, String name, String cpf, String email) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
	}

	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		email = entity.getEmail();

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

}
