package br.com.carangobom.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carangobom.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	List<Vehicle> findByBrand(String brand);

}
