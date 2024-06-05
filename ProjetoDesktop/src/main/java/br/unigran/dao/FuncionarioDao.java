package br.unigran.dao;

import br.unigran.entities.Funcionario;
import br.unigran.persistence.InterfaceDao;
import java.util.List;

public interface FuncionarioDao extends InterfaceDao<Long, Funcionario> {
    List<Funcionario> listarNome(String nome);
    
    
   Funcionario buscarPorEmailSenha(String email,String senha);
}
