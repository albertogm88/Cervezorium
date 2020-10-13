package com.www.cervezorium.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.www.cervezorium.dto.MarcaDTO;
import com.www.cervezorium.service.MarcaService;

@RestController
@RequestMapping(value = "/marcas")
public class MarcaRest {
	
	@Autowired
	MarcaService marcaService;
	
	@GetMapping
	public ResponseEntity<List> getMarcas(){
		return ResponseEntity.ok(marcaService.getMarcas());
	}
	
	@PostMapping
	public void createMarca(@RequestBody MarcaDTO dto) {
		marcaService.createMarca(dto);
	}
}
