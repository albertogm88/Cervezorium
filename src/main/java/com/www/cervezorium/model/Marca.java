package com.www.cervezorium.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Marca database table.
 * 
 */
@Entity
@NamedQuery(name="Marca.findAll", query="SELECT m FROM Marca m")
public class Marca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int codPais;

	private String name;

	public Marca() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodPais() {
		return this.codPais;
	}

	public void setCodPais(int codPais) {
		this.codPais = codPais;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}