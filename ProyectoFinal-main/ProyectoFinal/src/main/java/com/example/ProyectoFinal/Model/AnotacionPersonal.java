package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AnotacionPersonal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnotacion;

    private String titulo;
    private String contenido;
    private LocalDateTime fechaHora;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public AnotacionPersonal() {
    }

    public AnotacionPersonal(int idAnotacion, String titulo, String contenido, LocalDateTime fechaHora, Usuario usuario) {
        this.idAnotacion = idAnotacion;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaHora = fechaHora;
        this.usuario = usuario;
    }

    public int getIdAnotacion() {
        return idAnotacion;
    }

    public void setIdAnotacion(int idAnotacion) {
        this.idAnotacion = idAnotacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
