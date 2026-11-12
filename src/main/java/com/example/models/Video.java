package com.example.models;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity 
@Table (name = "Video")
public class Video {

    @Id 
    @GeneratedValue (strategy =GenerationType.UUID)
    private UUID id;

      @Column (name = "titulo", nullable = false, unique = false, length = 100)
    private String titulo;

    @Column (name = "descripcion", nullable = false, unique = false, length = 100)
    private String descripcion;

    @Column (name = "url", nullable = false, unique = false, length = 100)
    private String url;




    //Creando una relacion 
    @OneToMany (mappedBy="usuario")
    @JsonManagedReference()

    private Video video;
    private <Video> video;
    




    public Video() {
    }

    public Video(UUID id, String titulo, String descripcion, String url) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

}
