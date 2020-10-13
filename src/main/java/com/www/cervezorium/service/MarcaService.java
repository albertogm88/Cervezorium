package com.www.cervezorium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.cervezorium.dto.MarcaDTO;
import com.www.cervezorium.repository.MarcaRepository;

@Service
public class MarcaService {

	
	@Autowired
	MarcaRepository marcaRepository;
	
	
	public List getMarcas() {
		return (List) marcaRepository.findAll();
	}
	
	public void createMarca(MarcaDTO marca) {
		marcaRepository.save(marca.transform());
	}
}
