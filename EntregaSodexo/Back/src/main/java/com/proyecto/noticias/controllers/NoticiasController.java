package com.proyecto.noticias.controllers;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.noticias.dao.NoticiasDAO;
import com.proyecto.noticias.entity.Noticias;
import com.proyecto.noticias.enums.TipoRespuestaEnum;
import com.proyecto.noticias.util.CodRetorno;
import com.proyecto.noticias.util.JsonResponse;
import com.proyecto.noticias.vo.NoticiasVO;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/noticias")
public class NoticiasController {
	
	private final Logger log = LoggerFactory.getLogger(NoticiasController.class);

	
	@Autowired
	private NoticiasDAO noticiasDAO;
	
	@GetMapping("/all")
    public JsonResponse index() {
		
		try {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("lista",noticiasDAO.findAll());
			return CodRetorno.returnMessage(TipoRespuestaEnum.SUCCESS, "Lista de Noticias  exitoso",data); 
        } catch (Exception e) {
            return CodRetorno.returnMessage(TipoRespuestaEnum.ERROR, e.getMessage()); 
        }
		
		
	}
	
	
	@PostMapping("/create")
    public JsonResponse postcreate(@RequestBody NoticiasVO vo) {
	
		
		try {	
			Map<String, Object> data = new HashMap<String, Object>();
			Noticias pl=noticiasDAO.postCreate(vo);
			data.put("noticias",pl);
			return CodRetorno.returnMessage(TipoRespuestaEnum.SUCCESS, "Noticias creada exitosamente  exitoso",data); 
        } catch (Exception e) {
            return CodRetorno.returnMessage(TipoRespuestaEnum.ERROR, e.getMessage()); 
        }
		
		
	}
	
	@GetMapping("/favoritos")
    public JsonResponse favoritos() {
		try {
		Map<String, Object> data = new HashMap<String, Object>();
		
		data.put("favoritos",noticiasDAO.favoritos());		
		return CodRetorno.returnMessage(TipoRespuestaEnum.SUCCESS, "Lista de Favoritos exitoso",data); 

        } catch (Exception e) {
            return CodRetorno.returnMessage(TipoRespuestaEnum.ERROR, e.getMessage()); 
        }
       
	}
	@GetMapping("/noticias")
    public JsonResponse noticias() {
		try {
		Map<String, Object> data = new HashMap<String, Object>();		
		data.put("noticias",noticiasDAO.noticias());		
		return CodRetorno.returnMessage(TipoRespuestaEnum.SUCCESS, "Lista de Favoritos exitoso",data); 

        } catch (Exception e) {
            return CodRetorno.returnMessage(TipoRespuestaEnum.ERROR, e.getMessage()); 
        }
       
	}

}
