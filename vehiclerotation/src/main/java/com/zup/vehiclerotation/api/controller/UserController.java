package com.zup.vehiclerotation.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.vehiclerotation.api.dto.UserDTO;
import com.zup.vehiclerotation.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserService userService;

	@PostMapping 
	public ResponseEntity<?> createUser(@Valid @RequestBody UserDTO userDTO) {

		return userService.create(userDTO);
	}

	@GetMapping("/{id}/vehicle")
	public ResponseEntity<?> findUserVehiclesById(@PathVariable Long id) {
		return userService.findUserVehiclesById(id);
	}
}