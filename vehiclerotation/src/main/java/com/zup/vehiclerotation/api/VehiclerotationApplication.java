package com.zup.vehiclerotation.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VehiclerotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclerotationApplication.class, args);
	}

}
