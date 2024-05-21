package br.unigran.impl;

import br.unigran.dao.EntradaDao;
import br.unigran.entities.Entrada;
import br.unigran.entities.Produto;
import br.unigran.persistence.Dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class EntradaImpl implements EntradaDao {
    @Override
    public Entrada listarId(Long aLong) throws NoResultException {
        TypedQuery<Entrada> query = Dao.getInstace().getEm()
                .createQuery("SELECT e FROM Entrada e where e.id = :id", Entrada.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    @Override
    public List<Entrada> listar() throws NoResultException {
        TypedQuery<Entrada> query = Dao.getInstace().getEm()
                .createQuery("SELECT e FROM Entrada e ", Entrada.class);
        return query.getResultList();
    }
}
