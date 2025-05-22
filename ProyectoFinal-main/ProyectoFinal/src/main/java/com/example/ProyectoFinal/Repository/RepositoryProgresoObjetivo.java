package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.ProgresoObjetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProgresoObjetivo extends JpaRepository<ProgresoObjetivo, Integer> {
}
