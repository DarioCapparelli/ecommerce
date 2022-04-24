package com.ecommerce.model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	private Integer id;
	private String nombre;
	private String username;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String password;
	
	@Override
	public String toString() {
		return "Usuario [id: " + id + ", nombre: " + nombre + "username: " + username + ", email: " + email + ", direccion: " + direccion + ", telefono: " + telefono + ", tipo: " + tipo + ", password: " + password + "]";
	}

}
