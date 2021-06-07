package com.zup.vehiclerotation.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zup.vehiclerotation.api.dto.UserDTO;
import com.zup.vehiclerotation.api.dto.UserVehiclesDTO;
import com.zup.vehiclerotation.api.model.User;
import com.zup.vehiclerotation.api.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    public UserRepository userRepository;

    @Autowired
    public VehicleService vehicleService;

    public ResponseEntity<?> create(UserDTO userDTO){

        if(userRepository.existsUserByCpf(userDTO.getCpf())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CPF já está cadastrado.");
        }
        
        if(userRepository.existsUserByEmail(userDTO.getEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email já está cadastrado.");
        }

        User user = new User();

        user.setName(userDTO.getName());
        user.setCpf(userDTO.getCpf());
        user.setEmail(userDTO.getEmail());

        userRepository.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário cadastrado com sucesso!");
    }

    public ResponseEntity<?> findUserVehiclesById(Long id){
        
        if(userRepository.findById(id).isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Usuário não encontrado, verifique se o id é válido.");
        }

        User user = userRepository.findById(id).get();

        UserVehiclesDTO userVehiclesDTO = new UserVehiclesDTO(user);

        return ResponseEntity.status(HttpStatus.FOUND).body(userVehiclesDTO);
    }
} 
