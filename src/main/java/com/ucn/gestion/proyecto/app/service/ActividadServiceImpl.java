package com.ucn.gestion.proyecto.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucn.gestion.proyecto.app.dto.ActividadDto;
import com.ucn.gestion.proyecto.app.model.Actividad;
import com.ucn.gestion.proyecto.app.repository.ActividadRepository;

@Service
public class ActividadServiceImpl implements ActividadService{
	
	
	@Autowired
	ActividadRepository actividadRepository;

	@Override
	public Actividad guardar(ActividadDto actividadDto) {
		Actividad actividad = new Actividad(actividadDto.getNombre(), actividadDto.getDescripcion(), actividadDto.getEvidencia(), actividadDto.getRecomendacion(), 
				actividadDto.getFechaInicio(), actividadDto.getEstado(), actividadDto.getFechaInFin());
		return actividadRepository.save(actividad);
	}

}
