package com.example.ProyectoFinal.Services;

import com.example.ProyectoFinal.Model.ResumenProgreso;
import com.example.ProyectoFinal.Repository.RepositoryResumenProgreso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesResumenProgreso {

    @Autowired
    private RepositoryResumenProgreso repository;

    public List<ResumenProgreso> obtenerTodos() {
        return repository.findAll();
    }

    public Optional<ResumenProgreso> obtenerPorId(int id) {
        return repository.findById(id);
    }

    public ResumenProgreso guardar(ResumenProgreso resumen) {
        return repository.save(resumen);
    }

    public void eliminar(int id) {
        repository.deleteById(id);
    }
}
