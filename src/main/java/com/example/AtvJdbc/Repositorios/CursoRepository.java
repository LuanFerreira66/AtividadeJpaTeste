package com.example.AtvJdbc.Repositorios;

import com.example.AtvJdbc.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CursoRepository extends JpaRepository<Curso , Long>{
    void delete(Long id);
}
