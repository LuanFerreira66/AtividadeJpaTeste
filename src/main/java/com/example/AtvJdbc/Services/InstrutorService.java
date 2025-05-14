package com.example.AtvJdbc.Services;

import com.example.AtvJdbc.Model.Instrutor;
import com.example.AtvJdbc.Repositorios.InstrutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InstrutorService {

    @Autowired
    private InstrutorRepository instrutorRepository;

    public void salvar(Instrutor instrutor){
        instrutorRepository.save(instrutor);
    }

    public List<Instrutor> listar(){
        return instrutorRepository.findAll();
    }

    public Optional<Instrutor> listarPorId(Long id){
        return instrutorRepository.findById(id);
    }

    public void atualizar(Instrutor instrutor){
        instrutorRepository.update(instrutor);
    }

    public void deletar(Long id){
        instrutorRepository.delete(id);
    }



}
