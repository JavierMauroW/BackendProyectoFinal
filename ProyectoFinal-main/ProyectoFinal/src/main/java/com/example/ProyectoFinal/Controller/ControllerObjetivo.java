package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.Objetivo;
import com.example.ProyectoFinal.Repository.RepositoryObjetivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objetivos")
public class ControllerObjetivo {

    @Autowired
    private RepositoryObjetivo repository;

    @GetMapping
    public List<Objetivo> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Objetivo create(@RequestBody Objetivo objetivo) {
        return repository.save(objetivo);
    }

    @PutMapping("/{id}")
    public Objetivo update(@PathVariable int id, @RequestBody Objetivo objetivo) {
        objetivo.setIdObjetivo(id);
        return repository.save(objetivo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}

