package org.certificatic.tarjetaDijital.repository;

import java.util.List;

import org.certificatic.tarjetaDijital.model.tarjeta;

public interface TarjetaRepository {
	//metodo para crear una targeta nueva.
	
	tarjeta crearTarjeta(tarjeta tarjeta);
	
	//metodo para obtener todas las tarjetas 
	List<tarjeta> obtenerTodas();
	
	

}
