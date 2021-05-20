package br.com.carangobom.vehicle;

import br.com.carangobom.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	List<Vehicle> findByBrand(String brand);

}
