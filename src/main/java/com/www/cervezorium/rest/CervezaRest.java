package com.www.cervezorium.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.www.cervezorium.dto.CervezaDTO;
import com.www.cervezorium.service.CervezaService;

@RestController
@RequestMapping(value = "/cervezas")
public class CervezaRest {
	
	@Autowired
	CervezaService cervezaService;
	
	@GetMapping
	public ResponseEntity<List> getCervezas(){
		return ResponseEntity.ok(cervezaService.getCervezas());
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> getCerveza(){
		return ResponseEntity.ok(cervezaService.getCervezas());
	}
	
	@PostMapping
	public void createCerveza(@RequestBody CervezaDTO cerveza) {
		cervezaService.createCerveza(cerveza);
	}
	


}
