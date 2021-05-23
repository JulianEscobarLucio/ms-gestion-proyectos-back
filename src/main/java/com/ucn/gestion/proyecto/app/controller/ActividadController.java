package com.ucn.gestion.proyecto.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ucn.gestion.proyecto.app.dto.ActividadDto;
import com.ucn.gestion.proyecto.app.dto.RespuestaDTO;
import com.ucn.gestion.proyecto.app.service.ActividadService;

@RestController
@CrossOrigin
@RequestMapping("/actividad")
public class ActividadController {
	
	@Autowired
	ActividadService actividadService;

	
	@PostMapping("/agregar")
	public ResponseEntity<RespuestaDTO> agregar(@RequestBody ActividadDto actividadDto, UriComponentsBuilder builder) throws Exception {
		RespuestaDTO espuestaDTO = new RespuestaDTO();
		
		try {
		if(actividadService.guardar(actividadDto) == null) {
			espuestaDTO.setMensaje("La actividad no fue guardada, intentelo de nuevo más tarde.");	
			espuestaDTO.setEstadoDelaOperacion(false);
		} else {
			espuestaDTO.setMensaje("La actividad fue guardada con éxito.");
			espuestaDTO.setEstadoDelaOperacion(true);
		}
		} catch (Exception e) {
			espuestaDTO.setMensaje("Ocurrió un error guardando la actividad");
			return new ResponseEntity<RespuestaDTO>(espuestaDTO, HttpStatus.INTERNAL_SERVER_ERROR);

		}
		return new ResponseEntity<RespuestaDTO>(espuestaDTO, HttpStatus.CREATED);
	}
}
