package com.escola;

import com.escola.entity.Aluno;
import com.escola.persistence.AlunoPersistence;
import com.escola.service.AlunoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


public class AlunoTest {

    private List<Aluno> alunos = new ArrayList<>();

    Aluno aluno1 = new Aluno("Pedro Sousa", "23794896801", "Rua costa 1");
    Aluno aluno2 = new Aluno("Paulo Freitas", "74967490409", "Rua arau 10");


    @Test
    public void cadastrar() {
        AlunoPersistence mock = Mockito.mock(AlunoPersistence.class);
        Mockito.when(mock.add(Mockito.any(Aluno.class))).thenReturn(aluno1);
        Mockito.when(mock.getAll()).thenReturn(alunos);

        AlunoService alunoService = new AlunoService(mock);
        List<Aluno> alunosCadastrados = List.of(alunoService.salvar(aluno1));

        assertTrue(alunosCadastrados.contains(aluno1));
    }
}
