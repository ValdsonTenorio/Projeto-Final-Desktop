package br.unigran.impl;

import br.unigran.dao.SaidaDao;
import br.unigran.entities.Funcionario;
import br.unigran.entities.Saida;
import br.unigran.persistence.Dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class SaidaImpl implements SaidaDao {
    @Override
    public Saida listarId(Long aLong) throws NoResultException {
        TypedQuery<Saida> query = Dao.getInstace().getEm()
                .createQuery("SELECT s FROM Saida s where s.id = :id", Saida.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    @Override
    public List<Saida> listar(Funcionario builder) throws NoResultException {
        TypedQuery<Saida> query = Dao.getInstace().getEm()
                .createQuery("SELECT s FROM Saida s ", Saida.class);
        return query.getResultList();
    }
}
