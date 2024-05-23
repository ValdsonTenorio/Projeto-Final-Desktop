package br.unigran.impl;

import br.unigran.dao.EstoqueDao;
import br.unigran.entities.Estoque;
import br.unigran.entities.Funcionario;
import br.unigran.persistence.Dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class EstoqueImpl implements EstoqueDao {

    @Override
    public Estoque listarId(Long aLong) throws NoResultException {
        TypedQuery<Estoque> query = Dao.getInstace().getEm()
                .createQuery("SELECT e FROM Estoque e where e.id = :id", Estoque.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    @Override
    public List<Estoque> listar(Estoque builder) throws NoResultException {
        return null;
    }

    @Override
    public List<Estoque> listar(Funcionario builder) throws NoResultException {
        TypedQuery<Estoque> query = Dao.getInstace().getEm()
                .createQuery("SELECT e FROM Estoque e ", Estoque.class);
        return query.getResultList();
    }
}
