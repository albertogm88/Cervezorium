package com.www.cervezorium.dto;

import com.www.cervezorium.model.Cerveza;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class CervezaDTO {
	
	private String nombre;
	
	private String marca;
	
	private String foto;
	
	public Cerveza transform() {
		Cerveza cerveza = new Cerveza();
		cerveza.setNombre(this.nombre);
		cerveza.setFoto(this.foto);
		cerveza.setIdMarca(Integer.valueOf(this.marca));
		return cerveza;
	}

}
