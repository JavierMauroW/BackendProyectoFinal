package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.ResumenProgreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryResumenProgreso extends JpaRepository<ResumenProgreso, Integer> {
}
