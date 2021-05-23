package com.ucn.gestion.proyecto.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="tb_actividad")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Actividad  implements Serializable{
	
	
	private static final long serialVersionUID = -8530539988532923484L;
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id" ,  length = 36 , updatable = false, nullable = false)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="evidencia")
	private String evidencia;
	
	@Column(name="recomendacion")
	private String recomendacion;
	
	@Column(name="fechaInicio")
	private Date fechaInicio; 
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="fechaInFin")
	private Date fechaInFin;	
	

	public Actividad( String nombre, String descripcion, String evidencia, String recomendacion,
			Date fechaInicio, String estado, Date fechaInFin) {
		super();	
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.evidencia = evidencia;
		this.recomendacion = recomendacion;
		this.fechaInicio = fechaInicio;
		this.estado = estado;
		this.fechaInFin = fechaInFin;
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

	public String getEvidencia() {
		return evidencia;
	}

	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}

	public String getRecomendacion() {
		return recomendacion;
	}

	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaInFin() {
		return fechaInFin;
	}

	public void setFechaInFin(Date fechaInFin) {
		this.fechaInFin = fechaInFin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
