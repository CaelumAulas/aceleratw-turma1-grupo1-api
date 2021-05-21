package br.com.carangobom.vehicle;

import br.com.carangobom.domain.Vehicle;

public class VehicleDto {

	private String brand;
	private String model;
	private int year;
	private int value;

	public VehicleDto(Vehicle source) {
		this.brand = source.getBrand();
		this.model = source.getModel();
		this.year = source.getYear();
		this.value = source.getValue();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setPrice(int value) {
		this.value = value;
	}

}
