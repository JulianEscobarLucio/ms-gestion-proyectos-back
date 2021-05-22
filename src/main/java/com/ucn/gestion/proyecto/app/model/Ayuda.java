package com.ucn.gestion.proyecto.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="tb_ayuda")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Ayuda   implements Serializable{
	
	
	private static final long serialVersionUID = -8530539988532923484L;
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id" ,  length = 36 , updatable = false, nullable = false)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="enlace")
	private String enlace;
	
	@Column(name="archivo")
	private String archivo;
	
	

	public Ayuda(String nombre, String descripcion, String enlace, String archivo) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.enlace = enlace;
		this.archivo = archivo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
