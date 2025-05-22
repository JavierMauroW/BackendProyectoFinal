package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.NotaRapida;
import com.example.ProyectoFinal.Repository.RepositoryNotaRapida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notasrapidas")
public class ControllerNotaRapida {

    @Autowired
    private RepositoryNotaRapida repository;

    @GetMapping
    public List<NotaRapida> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public NotaRapida create(@RequestBody NotaRapida nota) {
        return repository.save(nota);
    }

    @PutMapping("/{id}")
    public NotaRapida update(@PathVariable int id, @RequestBody NotaRapida nota) {
        nota.setIdNota(id);
        return repository.save(nota);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
