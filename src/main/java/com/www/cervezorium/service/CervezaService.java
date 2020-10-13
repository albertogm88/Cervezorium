package com.www.cervezorium.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.cervezorium.dto.CervezaDTO;
import com.www.cervezorium.model.Cerveza;
import com.www.cervezorium.repository.CervezaRepository;

@Service
public class CervezaService {
	
	@Autowired
	CervezaRepository cervezaRepository;
	
	public List getCervezas() {
		return (List) cervezaRepository.findAll();
	}
	
	public Optional<Cerveza> getCerveza(String id) {
		return cervezaRepository.findById(Integer.valueOf(id));
	}
	

	public void createCerveza(CervezaDTO dto) {
		cervezaRepository.save(dto.transform());
	}
	
}
