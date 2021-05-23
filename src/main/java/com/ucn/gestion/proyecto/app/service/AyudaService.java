package com.ucn.gestion.proyecto.app.service;

import com.ucn.gestion.proyecto.app.dto.AyudaDto;
import com.ucn.gestion.proyecto.app.model.Ayuda;

public interface AyudaService {

	public Ayuda guardar(AyudaDto ayudaDto) throws Exception;

}
