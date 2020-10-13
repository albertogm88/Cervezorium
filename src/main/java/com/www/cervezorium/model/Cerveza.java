package com.www.cervezorium.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Cerveza database table.
 * 
 */
@Entity
@NamedQuery(name="Cerveza.findAll", query="SELECT c FROM Cerveza c")
public class Cerveza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String foto;

	private int idMarca;

	private String nombre;

	public Cerveza() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}