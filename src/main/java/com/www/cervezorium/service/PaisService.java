package com.www.cervezorium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.cervezorium.dto.PaisDTO;
import com.www.cervezorium.model.Pais;
import com.www.cervezorium.repository.PaisRepository;

@Service
public class PaisService {
	
	@Autowired
	PaisRepository paisRepository;
	
	public List getPaises() {
		return (List) paisRepository.findAll();
	}

	
	public void createPais(PaisDTO dto) {
		Pais pais = new Pais();
		pais.setNombre(dto.getNombre());
		paisRepository.save(pais);
	}
}
