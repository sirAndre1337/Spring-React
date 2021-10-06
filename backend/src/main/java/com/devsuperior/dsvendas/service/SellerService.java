package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		 List<Seller> lista = repository.findAll();
		 /*Funcão lambda basicamente transforma os objeto em DTO usando o construtor*/
		 return lista.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
 	}
}
