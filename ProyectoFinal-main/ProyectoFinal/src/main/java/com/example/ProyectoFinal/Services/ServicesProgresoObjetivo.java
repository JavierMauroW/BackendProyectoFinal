package com.example.ProyectoFinal.Services;

import com.example.ProyectoFinal.Model.ProgresoObjetivo;
import com.example.ProyectoFinal.Repository.RepositoryProgresoObjetivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesProgresoObjetivo {

    @Autowired
    private RepositoryProgresoObjetivo repository;

    public List<ProgresoObjetivo> obtenerTodos() {
        return repository.findAll();
    }

    public Optional<ProgresoObjetivo> obtenerPorId(int id) {
        return repository.findById(id);
    }

    public ProgresoObjetivo guardar(ProgresoObjetivo progreso) {
        return repository.save(progreso);
    }

    public void eliminar(int id) {
        repository.deleteById(id);
    }
}

