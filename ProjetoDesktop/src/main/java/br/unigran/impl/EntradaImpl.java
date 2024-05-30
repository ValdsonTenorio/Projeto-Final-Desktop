package br.unigran.impl;

import br.unigran.dao.EntradaDao;
import br.unigran.entities.Entrada;
import br.unigran.entities.Funcionario;
import br.unigran.persistence.Dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public abstract class EntradaImpl implements EntradaDao {
    @Override
    public Entrada listarId(Long aLong) throws NoResultException {
        TypedQuery<Entrada> query = Dao.getInstace().getEm()
                .createQuery("SELECT e FROM Entrada e where e.id = :id", Entrada.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    public List<Entrada> listar(Entrada builder) throws NoResultException {
        TypedQuery<Entrada> query = Dao.getInstace().getEm()
                .createQuery("SELECT e FROM Entrada e ", Entrada.class);
        return query.getResultList();
    }
}
