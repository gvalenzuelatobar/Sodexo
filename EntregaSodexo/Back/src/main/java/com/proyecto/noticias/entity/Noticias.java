package com.proyecto.noticias.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Noticias")
@NamedQueries({
    @NamedQuery(name = "Noticias.favoritos", query = "select x from Noticias x where x.favorito=1 order by x.id asc "),
    @NamedQuery(name = "Noticias.noticias", query = "select x from Noticias x where x.favorito=0 order by x.id asc ")
})

public class Noticias implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "resumen")
	private String resumen;
	
	@Column(name = "favorito")
	private Integer favorito;
	
	@Column(name = "fecha_Publicacion")
	private Date fecha_Publicacion;
	
	@Column(name = "fecha_guardado")
	private Date fecha_guardado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
