package br.unigran.dao;

import br.unigran.entities.Funcionario;
import br.unigran.persistence.InterfaceDao;
import java.util.List;

public interface FuncionarioDao extends InterfaceDao<Long, Funcionario> {
    List<Funcionario> listarNome(String nome);

    List<Funcionario> listarOrdenado(boolean asc);
    
   Funcionario buscarPorEmailSenha(String email,String senha);
}
