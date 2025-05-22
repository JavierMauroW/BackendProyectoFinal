package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.Objetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryObjetivo extends JpaRepository<Objetivo, Integer> {
}

