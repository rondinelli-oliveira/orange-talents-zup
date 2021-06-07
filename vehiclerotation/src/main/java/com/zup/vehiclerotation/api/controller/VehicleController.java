package com.zup.vehiclerotation.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.vehiclerotation.api.dto.VehicleDTO;
import com.zup.vehiclerotation.api.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
 
    @Autowired
    public VehicleService vehicleService;
    
    @PostMapping("/{userId}")
    public ResponseEntity<?> createVehicle(
        @Valid
        @RequestBody VehicleDTO vehicleDTO, 
        @PathVariable Long userId){

            return vehicleService.create(vehicleDTO, userId);
    }
}
