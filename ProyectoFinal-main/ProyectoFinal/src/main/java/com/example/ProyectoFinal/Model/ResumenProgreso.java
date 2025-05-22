package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ResumenProgreso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResumen;

    private LocalDate fecha;
    private int objetivosCompletados;
    private int totalObjetivos;
    private String comentarioResumen;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public ResumenProgreso() {
    }

    public ResumenProgreso(int idResumen, LocalDate fecha, int objetivosCompletados, int totalObjetivos, String comentarioResumen, Usuario usuario) {
        this.idResumen = idResumen;
        this.fecha = fecha;
        this.objetivosCompletados = objetivosCompletados;
        this.totalObjetivos = totalObjetivos;
        this.comentarioResumen = comentarioResumen;
        this.usuario = usuario;
    }

    public int getIdResumen() {
        return idResumen;
    }

    public void setIdResumen(int idResumen) {
        this.idResumen = idResumen;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getObjetivosCompletados() {
        return objetivosCompletados;
    }

    public void setObjetivosCompletados(int objetivosCompletados) {
        this.objetivosCompletados = objetivosCompletados;
    }

    public int getTotalObjetivos() {
        return totalObjetivos;
    }

    public void setTotalObjetivos(int totalObjetivos) {
        this.totalObjetivos = totalObjetivos;
    }

    public String getComentarioResumen() {
        return comentarioResumen;
    }

    public void setComentarioResumen(String comentarioResumen) {
        this.comentarioResumen = comentarioResumen;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
