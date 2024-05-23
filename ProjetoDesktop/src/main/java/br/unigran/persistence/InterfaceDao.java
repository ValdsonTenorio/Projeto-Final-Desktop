/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.persistence;

import br.unigran.entities.Funcionario;

import javax.persistence.NoResultException;
import java.util.List;

/**
 *
 * @author valds
 */
public interface InterfaceDao<ID, T> {
    public default void salvar(T entidade) {
        Dao.getInstace().salvar(entidade);
    }

    public default void atualiza(T entidade) {
        Dao.getInstace().atualiza(entidade);
    }

    public default void remove(T entidade) {
        Dao.getInstace().remove(entidade);
    }

    T listarId(ID id) throws NoResultException;

    List<T> listar(Funcionario builder) throws NoResultException;
}
