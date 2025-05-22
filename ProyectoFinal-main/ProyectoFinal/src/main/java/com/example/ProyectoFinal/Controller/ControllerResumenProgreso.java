package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.ResumenProgreso;
import com.example.ProyectoFinal.Repository.RepositoryResumenProgreso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resumenes")
public class ControllerResumenProgreso {

    @Autowired
    private RepositoryResumenProgreso repository;

    @GetMapping
    public List<ResumenProgreso> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResumenProgreso create(@RequestBody ResumenProgreso resumen) {
        return repository.save(resumen);
    }

    @PutMapping("/{id}")
    public ResumenProgreso update(@PathVariable int id, @RequestBody ResumenProgreso resumen) {
        resumen.setIdResumen(id);
        return repository.save(resumen);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
