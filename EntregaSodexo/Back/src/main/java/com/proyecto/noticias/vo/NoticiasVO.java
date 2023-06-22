package com.proyecto.noticias.vo;

import java.util.Date;

public class NoticiasVO {
	
	private String titulo;
	private String descripcion;
	private String resumen;
	private Integer favorito;
	private Date fecha_Publicacion;
	private Date fecha_guardado;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public Integer getFavorito() {
		return favorito;
	}
	public void setFavorito(Integer favorito) {
		this.favorito = favorito;
	}
	public Date getFecha_Publicacion() {
		return fecha_Publicacion;
	}
	public void setFecha_Publicacion(Date fecha_Publicacion) {
		this.fecha_Publicacion = fecha_Publicacion;
	}
	public Date getFecha_guardado() {
		return fecha_guardado;
	}
	public void setFecha_guardado(Date fecha_guardado) {
		this.fecha_guardado = fecha_guardado;
	}
	


}
