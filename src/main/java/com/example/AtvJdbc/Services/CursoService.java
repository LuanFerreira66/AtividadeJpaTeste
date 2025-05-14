package com.example.AtvJdbc.Services;

import com.example.AtvJdbc.Model.Curso;
import com.example.AtvJdbc.Repositorios.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public void salvar(Curso curso){
        cursoRepository.save(curso);
    }

    public List<Curso> listarTodos(){
        return cursoRepository.findAll();
    }


    public Optional<Curso> listarPorId(Long id){
        return cursoRepository.findById(id);
    }

    public void deletar(Long id){
        cursoRepository.delete(id);
    }
}
