package com.example.ProyectoFinal.Repository;


import com.example.ProyectoFinal.Model.AnotacionPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAnotacionPersonal extends JpaRepository<AnotacionPersonal, Integer> {
}
