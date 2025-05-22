package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class NotaRapida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNota;

    private String contenido;
    private LocalDate fechaCreacion;
    private boolean esRecordatorio;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public NotaRapida() {
    }

    public NotaRapida(int idNota, String contenido, LocalDate fechaCreacion, boolean esRecordatorio, Usuario usuario) {
        this.idNota = idNota;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.esRecordatorio = esRecordatorio;
        this.usuario = usuario;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isEsRecordatorio() {
        return esRecordatorio;
    }

    public void setEsRecordatorio(boolean esRecordatorio) {
        this.esRecordatorio = esRecordatorio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
