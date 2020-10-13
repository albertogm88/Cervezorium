package com.www.cervezorium.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.www.cervezorium.dto.PaisDTO;
import com.www.cervezorium.service.PaisService;

@RestController
@RequestMapping(value = "/paises")
public class PaisRest {

	@Autowired
	PaisService paisService;

	@GetMapping
	public ResponseEntity<List> getPaises(){
		return ResponseEntity.ok(paisService.getPaises());
	}
	
	
	@PostMapping
	public void createPais(@RequestBody PaisDTO dto) {
		paisService.createPais(dto);
	}
}
