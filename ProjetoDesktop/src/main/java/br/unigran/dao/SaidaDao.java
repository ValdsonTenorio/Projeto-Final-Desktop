package br.unigran.dao;

import br.unigran.persistence.InterfaceDao;

import java.util.List;

public interface SaidaDao extends InterfaceDao {
    public List listarByNome();
}

