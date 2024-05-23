package br.unigran.impl;

import br.unigran.dao.FuncionarioDao;
import br.unigran.entities.Funcionario;
import br.unigran.persistence.Dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class FuncionarioImpl implements FuncionarioDao {

    @Override
    public Funcionario listarId(Long aLong) throws NoResultException {
        TypedQuery<Funcionario> query = Dao.getInstace().getEm()
                .createQuery("SELECT f FROM Funcionario f where f.id = :id", Funcionario.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    @Override
    public List<Funcionario> listar(Funcionario builder) throws NoResultException {
        TypedQuery<Funcionario> query = Dao.getInstace().getEm()
                .createQuery("SELECT f FROM Funcionario f ", Funcionario.class);
        return query.getResultList();
    }
}
