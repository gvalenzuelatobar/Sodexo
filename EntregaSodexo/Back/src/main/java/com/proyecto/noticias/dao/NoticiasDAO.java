package com.proyecto.noticias.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.noticias.entity.Noticias;
import com.proyecto.noticias.vo.NoticiasVO;

@Repository
public interface NoticiasDAO extends CrudRepository<Noticias, Integer> {
	
	public List<Noticias> findAll();

	public Noticias postCreate(NoticiasVO vo);

	public List<Noticias> favoritos();

	public List<Noticias> noticias();


}
