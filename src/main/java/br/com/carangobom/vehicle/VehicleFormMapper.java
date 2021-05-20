package br.com.carangobom.vehicle;

import br.com.carangobom.domain.Vehicle;
import br.com.carangobom.infra.Mapper;
import org.springframework.stereotype.Component;

@Component
public class VehicleFormMapper implements Mapper<VehicleForm, Vehicle>{

	@Override
	public Vehicle map(VehicleForm source) {
		// TODO Auto-generated method stub
		return new Vehicle(source.getBrand(),source.getModel(), source.getYear(), source.getValue());
	}

}
