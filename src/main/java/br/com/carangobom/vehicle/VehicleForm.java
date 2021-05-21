package br.com.carangobom.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleForm {

	private String brand;
	private String model;
	private int year;
	private int value;

}
