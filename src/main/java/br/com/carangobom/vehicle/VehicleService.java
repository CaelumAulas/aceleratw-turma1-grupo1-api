package br.com.carangobom.vehicle;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carangobom.domain.Vehicle;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VehicleService {

    @Autowired
    private VehicleRepository repository;
    @Autowired
    private VehicleViewMapper viewMapper;
    private VehicleFormMapper formMapper;


    public List<VehicleDto> ListAllVehicles() {
        return repository.findAll().stream().map(viewMapper::map).collect(Collectors.toList());

    }

    public void saveVehicle(VehicleForm vehicleForm) {
        var vehicle = formMapper.map(vehicleForm);
        repository.save(vehicle);
    }

    public boolean deleteVehicle(long id){
        Optional<Vehicle> vehicle = repository.findById(id);

        if(vehicle.isEmpty()){
            return false;
        }
        repository.delete(repository.findById(id).get());

        return true;
    }

    public List<VehicleDto> findByBrand(String brand) {
        return repository.findByBrand(brand).stream().map(viewMapper::map).collect(Collectors.toList());
    }
}
