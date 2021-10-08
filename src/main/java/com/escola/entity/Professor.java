package com.escola.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private BigDecimal salario;
    private String endereco;

    public Professor() {
    }

    public Professor(String nome, String cpf, BigDecimal salario, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.endereco = endereco;
    }

    public Professor(Long id, String nome, String cpf, BigDecimal salario, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.endereco = endereco;
    }

}
