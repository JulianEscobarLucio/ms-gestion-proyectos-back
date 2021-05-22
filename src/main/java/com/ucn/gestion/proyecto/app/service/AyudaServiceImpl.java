package com.ucn.gestion.proyecto.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucn.gestion.proyecto.app.dto.AyudaDto;
import com.ucn.gestion.proyecto.app.model.Ayuda;
import com.ucn.gestion.proyecto.app.repository.AyudaRepository;

@Service
public class AyudaServiceImpl implements AyudaService{
	
	@Autowired
	AyudaRepository ayudaRepository;

	@Override
	public Ayuda guardar(AyudaDto ayudaDto) {
		Ayuda ayuda = new Ayuda(ayudaDto.getNombre(), ayudaDto.getDescripcion(), ayudaDto.getEnlace(), ayudaDto.getArchivo());
		return ayudaRepository.save(ayuda);
	}

}
