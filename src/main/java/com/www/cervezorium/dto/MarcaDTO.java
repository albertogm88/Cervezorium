package com.www.cervezorium.dto;

import com.www.cervezorium.model.Marca;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarcaDTO {
	
	private String nombre;
	
	private String codPais;
	
	
	public Marca transform() {
		Marca marca = new Marca();
		marca.setCodPais(Integer.valueOf(this.codPais));
		marca.setName(this.nombre);
		return marca;
	}

}
