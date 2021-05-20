package br.com.carangobom.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

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
