package org.certificatic.tarjetaDijital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDijital.model.tarjeta;
@WebService
public interface tarjetaService {

	//metodo para crear una targeta nueva.
	
		tarjeta crearTarjeta(tarjeta tarjeta);
		
		//metodo para obtener todas las tarjetas 
		List<tarjeta> obtenerTodas();
		
	
	
	
}
