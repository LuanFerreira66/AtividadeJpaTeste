package com.example.AtvJdbc.Repositorios;


import com.example.AtvJdbc.Model.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InstrutorRepository extends JpaRepository<Instrutor, Long>{

    void update(Instrutor instrutor);

    void delete(Long id);
}
