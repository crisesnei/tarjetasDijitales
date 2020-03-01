package org.certificatic.tarjetaDijital.repository;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.tarjetaDijital.model.tarjeta;

public class tarjetaRepositoryImpl implements TarjetaRepository {
  
	private static List<tarjeta> tarjetasDigitales = 
			       new ArrayList<tarjeta>();
	
	@Override
	public tarjeta crearTarjeta(tarjeta tarjeta) {
		System.out.println("Crear tarjeta::::");
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<tarjeta> obtenerTodas() {
		System.out.println("::: Obtener todas las tarjetas");
		return tarjetasDigitales;
	}

}
