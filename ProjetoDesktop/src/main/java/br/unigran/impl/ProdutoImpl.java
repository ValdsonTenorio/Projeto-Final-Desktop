package br.unigran.impl;

import br.unigran.dao.ProdutoDao;

import java.util.List;

public class ProdutoImpl implements ProdutoDao {
    @Override
    public List listarByNome() {
        return List.of();
    }
}
