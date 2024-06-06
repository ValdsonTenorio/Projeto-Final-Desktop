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


    public List<Produto> listar() throws NoResultException {
         TypedQuery<Produto> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Produto p ", Produto.class);
        return query.getResultList();
    }

    @Override
    public List<Produto> listarNome(String nome) {
       TypedQuery<Produto> query = Dao.getInstace().getEm()
               .createQuery("SELECT p FROM Produto p where p.categoria = :cat", Produto.class)
               .setParameter("cat", nome);
       
       return query.getResultList();
    }

    public List<Produto> listarOrdenado(boolean asc) throws NoResultException {
        TypedQuery<Produto> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Produto p order by p.marca " + (asc ? "asc" : "desc"), Produto.class);
        return query.getResultList();
    }
}
