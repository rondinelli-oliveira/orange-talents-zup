package com.zup.vehiclerotation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.vehiclerotation.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsUserByCpf(String cpf);

	boolean existsUserByEmail(String email);

}