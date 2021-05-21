package br.com.carangobom.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehicles")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String brand;
	private String model;
	private int year;
	private int value;

	public Vehicle(String brand, String model, int year, int value) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.value = value;
	}
}
