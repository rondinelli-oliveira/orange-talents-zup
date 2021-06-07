package com.zup.vehiclerotation.api.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zup.vehiclerotation.api.consumer.dto.BrandDTO;
import com.zup.vehiclerotation.api.consumer.dto.ModelListDTO;
import com.zup.vehiclerotation.api.consumer.dto.VehicleDTO;
import com.zup.vehiclerotation.api.consumer.dto.YearDTO;

@FeignClient(name="FipeClient", url="https://parallelum.com.br/fipe/api/v1")
public interface FipeClient {

    //https://parallelum.com.br/fipe/api/v1/carros/marcas
    @GetMapping("/carros/marcas")
    List<BrandDTO> getBrandsList();

    //https://parallelum.com.br/fipe/api/v1/carros/marcas/{brandId}/modelos
    @GetMapping("/carros/marcas/{brandCode}/modelos")
    ModelListDTO getModelsResponse(@PathVariable String brandCode);

    //https://parallelum.com.br/fipe/api/v1/carros/marcas/{brandId}/modelos/{modelId}/anos
    @GetMapping("/carros/marcas/{brandCode}/modelos/{modelCode}/anos")
    List<YearDTO> getYears(
        @PathVariable String brandCode,
        @PathVariable String modelCode);

    //https://parallelum.com.br/fipe/api/v1/carros/marcas/{brandId}/modelos/{modelId}/anos/{yearId}"
    @GetMapping("/carros/marcas/{brandCode}/modelos/{modelCode}/anos/{yearCode}")
    VehicleDTO getVehicle(
        @PathVariable String brandCode,
        @PathVariable String modelCode,
        @PathVariable String yearCode);
}
