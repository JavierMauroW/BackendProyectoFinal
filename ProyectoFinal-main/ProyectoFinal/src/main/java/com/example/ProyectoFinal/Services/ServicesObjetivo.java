package com.example.ProyectoFinal.Services;

import com.example.ProyectoFinal.Model.Objetivo;
import com.example.ProyectoFinal.Repository.RepositoryObjetivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesObjetivo {

    @Autowired
    private RepositoryObjetivo repository;

    public List<Objetivo> obtenerTodos() {
        return repository.findAll();
    }

    public Optional<Objetivo> obtenerPorId(int id) {
        return repository.findById(id);
    }

    public Objetivo guardar(Objetivo objetivo) {
        return repository.save(objetivo);
    }

    public void eliminar(int id) {
        repository.deleteById(id);
    }

    public Objetivo marcarComoCompletado(int id) {
        Optional<Objetivo> objetivoOpt = repository.findById(id);
        if (objetivoOpt.isPresent()) {
            Objetivo objetivo = objetivoOpt.get();
            objetivo.setCompletado(true); // Asegúrate que tu entidad tiene este setter
            return repository.save(objetivo);
        } else {
            throw new RuntimeException("Objetivo no encontrado con id: " + id);
        }

    }
}