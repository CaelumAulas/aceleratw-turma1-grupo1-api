package br.com.carangobom.vehicle;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/vehicles")
@AllArgsConstructor
public class VehicleController {

    private final VehicleService service;


    @GetMapping
    public List<VehicleDto> list() {
        return service.ListAllVehicles();
    }

    @GetMapping(value = "/search")
    public List<VehicleDto> findByBrand(@RequestParam(value = "brand") String brand) {
        return service.findByBrand(brand);
    }

    @PostMapping
    public ResponseEntity<VehicleDto> persistVehicle(@RequestBody VehicleForm vehicleForm) {

        service.saveVehicle(vehicleForm);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<VehicleDto> deleteVehicle(@RequestBody long id) {

        if (service.deleteVehicle(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
