package com.example.ProyectoFinal.Services;

import com.example.ProyectoFinal.Model.Usuario;
import com.example.ProyectoFinal.Repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesUsuario {

    @Autowired
    private RepositoryUsuario repository;

    public List<Usuario> obtenerTodos() {
        return repository.findAll();
    }

    public Optional<Usuario> obtenerPorId(int id) {
        return repository.findById(id);
    }

    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    public void eliminar(int id) {
        repository.deleteById(id);
    }
}
