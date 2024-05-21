package br.unigran.dao;

import br.unigran.persistence.InterfaceDao;

import java.util.List;

public interface ProdutoDao extends InterfaceDao {
    public List listarByNome();
}

