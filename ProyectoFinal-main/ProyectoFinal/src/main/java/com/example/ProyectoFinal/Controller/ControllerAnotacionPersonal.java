package com.example.ProyectoFinal.Controller;


import com.example.ProyectoFinal.Model.AnotacionPersonal;
import com.example.ProyectoFinal.Repository.RepositoryAnotacionPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anotaciones")
public class ControllerAnotacionPersonal {

    @Autowired
    private RepositoryAnotacionPersonal repository;

    @GetMapping
    public List<AnotacionPersonal> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public AnotacionPersonal create(@RequestBody AnotacionPersonal anotacion) {
        return repository.save(anotacion);
    }

    @PutMapping("/{id}")
    public AnotacionPersonal update(@PathVariable int id, @RequestBody AnotacionPersonal anotacion) {
        anotacion.setIdAnotacion(id);
        return repository.save(anotacion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}

