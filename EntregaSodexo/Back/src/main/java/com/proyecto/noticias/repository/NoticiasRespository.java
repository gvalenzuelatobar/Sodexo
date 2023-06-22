 package com.proyecto.noticias.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.noticias.entity.Noticias;

public interface NoticiasRespository extends JpaRepository<Noticias, Integer> { 
	
	public ArrayList<Noticias> findAll();
	
	public ArrayList<Noticias> favoritos();
	
	public ArrayList<Noticias> noticias();
	
	

}
