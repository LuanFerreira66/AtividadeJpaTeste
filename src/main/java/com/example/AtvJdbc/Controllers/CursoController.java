package com.example.AtvJdbc.Controllers;

import com.example.AtvJdbc.Model.Curso;
import com.example.AtvJdbc.Services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody Curso curso){
        cursoService.salvar(curso);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Curso>> listar(){
        return ResponseEntity.ok(cursoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Curso>> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(cursoService.listarPorId(id));
    }


    @GetMapping("/instrutorId/{id}")
    public ResponseEntity<Optional<Curso>> buscarPorIdInstrutor(@PathVariable Long id){
        return ResponseEntity.ok(cursoService.listarPorId(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        cursoService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
