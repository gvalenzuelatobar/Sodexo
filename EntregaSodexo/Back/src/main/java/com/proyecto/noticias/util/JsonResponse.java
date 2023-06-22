package com.proyecto.noticias.util;

import java.util.HashMap;
import java.util.Map;

import com.proyecto.noticias.enums.TipoRespuestaEnum;

public class JsonResponse {

		private TipoRespuestaEnum estado;
		private String mensaje;
		private String descError;
		private String log;
		private Map<String, Object> data;

		public JsonResponse() {
			this.estado = TipoRespuestaEnum.ERROR;
		}
		
		public JsonResponse(String mensaje) {
			this.estado = TipoRespuestaEnum.ERROR;
			this.mensaje = mensaje;
		}
		
		public TipoRespuestaEnum getEstado() {
			return estado;
		}
		public void setEstado(TipoRespuestaEnum estado) {
			this.estado = estado;
		}
		public String getMensaje() {
			return mensaje;
		}
		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}
		public String getDescError() {
			return descError;
		}
		public void setDescError(String descError) {
			this.descError = descError;
		}
		public String getLog() {
			return log;
		}
		public void setLog(String log) {
			this.log = log;
		}
		public Map<String, Object> getData() {
			return data;
		}
		public void setData(Map<String, Object> data) {
			this.data = data;
		}
		public void addData(String llave, Object dato) {
			if (this.data == null) {
				this.data = new HashMap<>();
			}
			this.data.put(llave, dato);
		}
}
