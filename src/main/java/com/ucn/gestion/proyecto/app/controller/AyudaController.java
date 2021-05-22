package com.ucn.gestion.proyecto.app.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ucn.gestion.proyecto.app.dto.AyudaDto;
import com.ucn.gestion.proyecto.app.dto.RespuestaDTO;
import com.ucn.gestion.proyecto.app.service.AyudaService;


@RestController
@CrossOrigin
@RequestMapping("/ayuda")
public class AyudaController {
	
	@Autowired
	AyudaService ayudaService;
	
	@GetMapping("/version")
	public ResponseEntity<String> version() {
		return new ResponseEntity<String>(new Date().toString(), HttpStatus.OK);
	}	
	
	@PostMapping("/agregar")
	public ResponseEntity<RespuestaDTO> agregar(@RequestBody AyudaDto ayudaDto, UriComponentsBuilder builder) throws Exception {
		RespuestaDTO espuestaDTO = new RespuestaDTO();
		
		try {
		if(ayudaService.guardar(ayudaDto) == null) {
			espuestaDTO.setMensaje("La ayuda no fue guardada, intentelo de nuevo más tarde.");	
			espuestaDTO.setEstadoDelaOperacion(false);
		} else {
			espuestaDTO.setMensaje("La ayuda fue guardada con éxito.");
			espuestaDTO.setEstadoDelaOperacion(true);
		}
		} catch (Exception e) {
			espuestaDTO.setMensaje("Ocurrió un error guardando la ayuda");
			return new ResponseEntity<RespuestaDTO>(espuestaDTO, HttpStatus.INTERNAL_SERVER_ERROR);

		}
		return new ResponseEntity<RespuestaDTO>(espuestaDTO, HttpStatus.CREATED);
	}


}
