package com.proyecto.noticias.util;





import java.util.Map;

import com.proyecto.noticias.enums.TipoRespuestaEnum;

public class CodRetorno {
	

	
	public  static final JsonResponse returnMessage(TipoRespuestaEnum estado,String message) {
		JsonResponse resp = new JsonResponse();
		resp.setEstado(estado);
		resp.setMensaje(message);

		return resp;
	}

	public  static final JsonResponse returnMessage(TipoRespuestaEnum estado,String message,Map<String, Object> data) {
		JsonResponse resp = new JsonResponse();
		resp.setEstado(estado);
		resp.setMensaje(message);
		resp.setData(data);
		return resp;
	}



}
