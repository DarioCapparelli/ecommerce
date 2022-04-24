package com.ecommerce.model;

import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orden {

	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	private double total;
	
	@Override
	public String toString() {
		return "Orden [id: " + id + ", numero: " + numero + "fechaCreacion: " + fechaCreacion + ", fechaRecibida: " + fechaRecibida + ", total: " + total +  "]";
	}
}
