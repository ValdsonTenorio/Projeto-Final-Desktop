package br.unigran.impl;

import br.unigran.dao.ProdutoDao;
import br.unigran.entities.Funcionario;
import br.unigran.entities.Produto;
import br.unigran.persistence.Dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class ProdutoImpl implements ProdutoDao {

    @Override
    public Produto listarId(Long aLong) throws NoResultException {
        TypedQuery<Produto> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Produto p where p.codProd = :id", Produto.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    @Override
    public List<Produto> listar(Funcionario builder) throws NoResultException {
         TypedQuery<Produto> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Produto p ", Produto.class);
        return query.getResultList();
    }
}
