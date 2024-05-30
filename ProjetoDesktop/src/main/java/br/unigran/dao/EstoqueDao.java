package br.unigran.dao;

import br.unigran.entities.Estoque;
import br.unigran.entities.Funcionario;
import br.unigran.persistence.InterfaceDao;

import javax.persistence.NoResultException;
import java.util.List;

public interface EstoqueDao extends InterfaceDao<Long, Estoque>{
}
