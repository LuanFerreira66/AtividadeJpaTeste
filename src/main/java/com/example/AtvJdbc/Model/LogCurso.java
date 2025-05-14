package com.example.AtvJdbc.Model;

import java.time.LocalDateTime;
import jakarta.persistence.*;
@Entity
@Table(name = "logCurso")
public class LogCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long cursoId;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    public LogCurso(Long id, Long cursoId, String titulo, LocalDateTime dataCriacao) {
        this.id = id;
        this.cursoId = cursoId;
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }
}
