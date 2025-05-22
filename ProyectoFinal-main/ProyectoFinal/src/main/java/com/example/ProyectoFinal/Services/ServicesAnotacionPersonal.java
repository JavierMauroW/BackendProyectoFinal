package com.example.ProyectoFinal.Services;

import com.example.ProyectoFinal.Model.AnotacionPersonal;
import com.example.ProyectoFinal.Repository.RepositoryAnotacionPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesAnotacionPersonal {

    @Autowired
    private RepositoryAnotacionPersonal repository;

    public List<AnotacionPersonal> obtenerTodas() {
        return repository.findAll();
    }

    public Optional<AnotacionPersonal> obtenerPorId(int id) {
        return repository.findById(id);
    }

    public AnotacionPersonal guardar(AnotacionPersonal anotacion) {
        return repository.save(anotacion);
    }

    public void eliminar(int id) {
        repository.deleteById(id);
    }
}
