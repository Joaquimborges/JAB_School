package com.escola.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ra;
    private String nome;
    private String cpf;
    private String endereco;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Aluno(Long id, String ra, String nome, String cpf, String endereco) {
        this.id = id;
        this.ra = ra;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }


}
