package br.unigran.dao;

import br.unigran.persistence.InterfaceDao;

import java.util.List;

public interface ValidadeDao extends InterfaceDao {
    public List listarByNome();
}
