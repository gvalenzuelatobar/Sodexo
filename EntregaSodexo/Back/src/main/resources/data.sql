DROP TABLE Noticias ;  


CREATE TABLE Noticias (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    titulo VARCHAR ,
    descripcion VARCHAR,
    resumen VARCHAR(128),
	favorito   INTEGER  ,
	fecha_Publicacion   DATE  ,
	fecha_guardado   DATE  ,
    PRIMARY KEY (id)
);

insert into Noticias values (1, 'policia loco','un policia mata a mucha gente', 'resumen1', 0, '2021-12-12', '2023-01-01');
