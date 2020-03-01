package org.certificatic.tarjetaDijital.model;

public class tarjeta {
  
	private String nombreEntidad;
	private String numeroTarjeta;
	private String fechaCaudicidad;
	private String nombreTitular;
	private String cvv;
	private marcaEnum marca;
	
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getFechaCaudicidad() {
		return fechaCaudicidad;
	}
	public void setFechaCaudicidad(String fechaCaudicidad) {
		this.fechaCaudicidad = fechaCaudicidad;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public marcaEnum getMarca() {
		return marca;
	}
	public void setMarca(marcaEnum marca) {
		this.marca = marca;
	}
	
	
}
