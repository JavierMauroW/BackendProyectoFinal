package com.example.ProyectoFinal.Model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ProgresoObjetivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgreso;

    private LocalDate fecha;
    private String progresoDiario;
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "id_objetivo")
    private Objetivo objetivo;

    public ProgresoObjetivo() {
    }

    public ProgresoObjetivo(int idProgreso, LocalDate fecha, String progresoDiario, String comentario, Objetivo objetivo) {
        this.idProgreso = idProgreso;
        this.fecha = fecha;
        this.progresoDiario = progresoDiario;
        this.comentario = comentario;
        this.objetivo = objetivo;
    }

    public int getIdProgreso() {
        return idProgreso;
    }

    public void setIdProgreso(int idProgreso) {
        this.idProgreso = idProgreso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getProgresoDiario() {
        return progresoDiario;
    }

    public void setProgresoDiario(String progresoDiario) {
        this.progresoDiario = progresoDiario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }
}
