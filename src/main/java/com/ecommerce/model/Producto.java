package com.ecommerce.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

	private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private double precio;
	private int cantidad;
	
	@Override
	public String toString() {
		return "Producto [id: " + id + ", nombre: " + nombre + "descripcion: " + descripcion + ", precio: " + precio + ", cantidad: " + cantidad +  "]";
	}
}

