package com.escola.service;

import com.escola.entity.Aluno;
import com.escola.persistence.AlunoPersistence;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AlunoService {

    private AlunoPersistence alunoPersistence;

    public AlunoService(AlunoPersistence alunoPersistence) {
        this.alunoPersistence = alunoPersistence;
    }

    public String gerarRa() {
        return "RA" + ThreadLocalRandom.current().nextInt(100, 999);
    }

    public void salvar(Aluno aluno) {
        if (aluno.getRa() == null || aluno.getRa().isEmpty()) {
            aluno.setRa(gerarRa());
            alunoPersistence.add(aluno);
        }
    }

    public Aluno get(Long id) {
        return alunoPersistence.get(id);
    }

    public List<Aluno> listar(){
        return alunoPersistence.getAll();
    }

    public void update(Aluno aluno) {
        if (aluno != null) {
            alunoPersistence.update(aluno);
        }
    }

    public void delete(Long id) {
        alunoPersistence.delete(id);
    }


}