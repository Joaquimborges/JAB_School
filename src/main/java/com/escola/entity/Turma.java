package com.escola.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToMany
    private List<Aluno> alunos;
    @ManyToMany
    private List<Professor> professores;

    public Turma() {
    }

    public Turma(String nome, List<Aluno> alunos, List<Professor> professores) {
        this.nome = nome;
        this.alunos = alunos;
        this.professores = professores;
    }

    public Turma(Long id, String nome, List<Aluno> alunos, List<Professor> professores) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
        this.professores = professores;
    }

}
