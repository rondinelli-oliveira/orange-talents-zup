package com.zup.vehiclerotation.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zup.vehiclerotation.api.dto.VehicleDTO;
import com.zup.vehiclerotation.api.model.User;
import com.zup.vehiclerotation.api.model.Vehicle;
import com.zup.vehiclerotation.api.repository.UserRepository;
import com.zup.vehiclerotation.api.repository.VehicleRepository;

@Service
public class VehicleService {
    
    @Autowired
    public VehicleRepository vehicleRepository;

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public NoDriveDayService noDriveDayService;

    @Autowired
    public VehiclePriceService vehiclePriceService;

    public ResponseEntity<?> create(VehicleDTO vehicleDTO, Long userId){

        if(userRepository.findById(userId).isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Usuário não encontrado, verifique se o id é válido.");
        }

        User user = userRepository.findById(userId).get();

        Vehicle vehicle = new Vehicle();

        String year = vehicleDTO.getYear();
        String brand = vehicleDTO.getBrand();
        String model = vehicleDTO.getModel();
        
        String noDriveDay = noDriveDayService.getNoDriveDay(year);

        Boolean noDriveDayActive = noDriveDayService.isDriveDayActive(noDriveDay);

        String price = vehiclePriceService.getPriceFIPE(brand, model, year);

        vehicle.setBrand(brand);
        vehicle.setModel(model);
        vehicle.setYear(year);
        vehicle.setNoDriveDay(noDriveDay);
        vehicle.setNoDriveDayActive(noDriveDayActive);
        vehicle.setPrice(price);
        vehicle.setUser(user);

        vehicleRepository.save(vehicle);
           
        VehicleDTO showVehicleDTO = new VehicleDTO(vehicle);

        return ResponseEntity.status(HttpStatus.CREATED).body(showVehicleDTO);
    }
}