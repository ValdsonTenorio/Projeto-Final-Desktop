package br.unigran.impl;

import br.unigran.dao.ValidadeDao;
import br.unigran.entities.Funcionario;
import br.unigran.entities.Validade;
import br.unigran.persistence.Dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public abstract class ValidadeImpl implements ValidadeDao {

    @Override
    public Validade listarId(Long aLong) throws NoResultException {
        TypedQuery<Validade> query = Dao.getInstace().getEm()
                .createQuery("SELECT v FROM Validade v where v.id = :id", Validade.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }


    public List listar(Funcionario builder) throws NoResultException {
        TypedQuery<Validade> query = Dao.getInstace().getEm()
                .createQuery("SELECT v FROM Validade v ", Validade.class);
        return query.getResultList();
    }
}
