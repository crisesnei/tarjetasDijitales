package org.certificatic.tarjetaDijital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDijital.model.tarjeta;
import org.certificatic.tarjetaDijital.repository.TarjetaRepository;
import org.certificatic.tarjetaDijital.repository.tarjetaRepositoryImpl;

@WebService(endpointInterface = "org.certificatic.tarjetaDijital.service.tarjetaService")
public class tarjetaServiceImpl implements tarjetaService {

	TarjetaRepository tarjetaRepository = new tarjetaRepositoryImpl();
	
	@Override
	public tarjeta crearTarjeta(tarjeta tarjeta) {
		
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<tarjeta> obtenerTodas() {
		
		return tarjetaRepository.obtenerTodas();
	}
	
	

}
