package com.example.AtvJdbc.Model;


import jakarta.persistence.*;
@Entity
@Table(name = "curso")

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long instrutorId;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private Double duracaoHoras;

    public Curso(Long id, Double duracaoHoras, String titulo, Long instrutorId) {
        this.id = id;
        this.duracaoHoras = duracaoHoras;
        this.titulo = titulo;
        this.instrutorId = instrutorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(Double duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getInstrutorId() {
        return instrutorId;
    }

    public void setInstrutorId(Long instrutorId) {
        this.instrutorId = instrutorId;
    }
}
