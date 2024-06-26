package br.unigran.dao;

import br.unigran.entities.Produto;
import br.unigran.persistence.InterfaceDao;

import java.util.List;

public interface ProdutoDao extends InterfaceDao<Long, Produto> {
    List<Produto> listarNome(String nome);

    List<Produto> listarOrdenado(boolean asc);
}

