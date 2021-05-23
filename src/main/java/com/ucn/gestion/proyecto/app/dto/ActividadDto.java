package com.ucn.gestion.proyecto.app.dto;

import java.util.Date;

public class ActividadDto {
private String nombre;
private String descripcion;
private String evidencia;
private String recomendacion;
private Date fechaInicio; 
private String estado;
private Date fechaInFin;




public ActividadDto(String nombre, String descripcion, String evidencia, String recomendacion, Date fechaInicio,
		String estado, Date fechaInFin) {
	super();
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.evidencia = evidencia;
	this.recomendacion = recomendacion;
	this.fechaInicio = fechaInicio;
	this.estado = estado;
	this.fechaInFin = fechaInFin;
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
	

}
