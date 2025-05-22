package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.ProgresoObjetivo;
import com.example.ProyectoFinal.Repository.RepositoryProgresoObjetivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/progresos")
public class ControllerProgresoObjetivo {

    @Autowired
    private RepositoryProgresoObjetivo repository;

    @GetMapping
    public List<ProgresoObjetivo> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public ProgresoObjetivo create(@RequestBody ProgresoObjetivo progreso) {
        return repository.save(progreso);
    }

    @PutMapping("/{id}")
    public ProgresoObjetivo update(@PathVariable int id, @RequestBody ProgresoObjetivo progreso) {
        progreso.setIdProgreso(id);
        return repository.save(progreso);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
