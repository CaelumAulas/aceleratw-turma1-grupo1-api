package br.com.carangobom.vehicle;

import br.com.carangobom.domain.Vehicle;
import br.com.carangobom.infra.Mapper;
import org.springframework.stereotype.Component;

@Component
public class VehicleViewMapper implements Mapper<Vehicle, VehicleDto>{

	@Override
	public VehicleDto map(Vehicle source) {
		
		return new VehicleDto(source);
	}

}
