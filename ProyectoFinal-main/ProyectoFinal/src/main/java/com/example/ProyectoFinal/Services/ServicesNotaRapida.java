package com.example.ProyectoFinal.Services;

import com.example.ProyectoFinal.Model.NotaRapida;
import com.example.ProyectoFinal.Repository.RepositoryNotaRapida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesNotaRapida {

    @Autowired
    private RepositoryNotaRapida repository;

    public List<NotaRapida> obtenerTodas() {
        return repository.findAll();
    }

    public Optional<NotaRapida> obtenerPorId(int id) {
        return repository.findById(id);
    }

    public NotaRapida guardar(NotaRapida nota) {
        return repository.save(nota);
    }

    public void eliminar(int id) {
        repository.deleteById(id);
    }
}
