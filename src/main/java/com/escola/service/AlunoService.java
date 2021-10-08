package com.escola.service;


import com.escola.entity.Aluno;
import com.escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public String gerarRa() {
        return "RA" + ThreadLocalRandom.current().nextInt(100, 999);
    }

    public Aluno salvar(Aluno aluno) {
        if (aluno.getRa() == null || aluno.getRa().isEmpty()) {
            aluno.setRa(gerarRa());
            alunoRepository.save(aluno);
        }
        return aluno;
    }



}
