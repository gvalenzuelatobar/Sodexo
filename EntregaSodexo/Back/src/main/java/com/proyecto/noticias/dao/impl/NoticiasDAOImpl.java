package com.proyecto.noticias.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.noticias.dao.NoticiasDAO;
import com.proyecto.noticias.entity.Noticias;
import com.proyecto.noticias.repository.NoticiasRespository;
import com.proyecto.noticias.vo.NoticiasVO;

@Service
public class NoticiasDAOImpl implements NoticiasDAO{
	
	
	@Autowired
	NoticiasRespository noticiasRespository;
	
	public List<Noticias> findAll() {
		return (List<Noticias>) noticiasRespository.findAll();
	}
	
	@Override
	public Noticias postCreate(NoticiasVO vo) {
		Noticias noti = new Noticias();
		noti.setTitulo(vo.getTitulo());
		noti.setFavorito(vo.getFavorito());
		noti.setResumen(vo.getResumen());
		noti.setDescripcion(vo.getDescripcion());
		noti.setFecha_guardado(vo.getFecha_guardado());
		noti.setFecha_Publicacion(vo.getFecha_Publicacion());
		noticiasRespository.save(noti);
		return noti;
	}
	
	@Override
	public List<Noticias>  favoritos() {
		List<Noticias> lista =(List<Noticias>) noticiasRespository.findAll();
		List<Noticias> noti = lista
			    .stream()
			    .filter(noticia -> noticia.getFavorito() ==1)
			    .collect(Collectors.toList());
		
		if(noti.size() > 10 ) {
			noti =  noti.subList(0, 10);
		}else {
			noti =  noti.subList(0,noti.size());
		}
		System.out.println("favoritos "  + noti.size());
		return noti;
	}
	
	@Override
	public List<Noticias>  noticias() {
		List<Noticias> lista =(List<Noticias>) noticiasRespository.findAll();
		List<Noticias> noti = lista
			    .stream()
			    .filter(noticia -> noticia.getFavorito() ==0)
			    .collect(Collectors.toList());
		
		if(noti.size() > 10 ) {
			noti =  noti.subList(0, 10);
		}else {
			noti =  noti.subList(0,noti.size());
		}
		System.out.println("noticias "  + noti.size());
		return noti;
	}

	@Override
	public <S extends Noticias> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Noticias> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Noticias> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Noticias> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Noticias entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Noticias> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	
}
