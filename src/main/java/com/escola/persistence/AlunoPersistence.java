package com.escola.persistence;

import com.escola.entity.Aluno;
import com.escola.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AlunoPersistence {
    private EntityManager em;

    public AlunoPersistence() {
        em = JPAUtil.getEntityManager();
    }

    public Aluno add(Aluno aluno) {
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        return aluno;
    }

    public Aluno get(Long id) {
        return em.find(Aluno.class, id);
    }

    public List<Aluno> getAll() {
        TypedQuery<Aluno> query = em.createQuery("from Aluno" ,Aluno.class);
        return query.getResultList();
    }

    public void update(Aluno aluno) {
        em.getTransaction().begin();
        Aluno alunoASerAtualizado = em.find(Aluno.class, aluno.getId());
        alunoASerAtualizado.setNome(aluno.getNome());
        alunoASerAtualizado.setEndereco(aluno.getEndereco());
        em.getTransaction().commit();
    }

    public void delete(Long id) {
        em.getTransaction().begin();
        Aluno aluno = em.find(Aluno.class, id);
        em.remove(aluno);
        em.getTransaction().commit();

    }

}
