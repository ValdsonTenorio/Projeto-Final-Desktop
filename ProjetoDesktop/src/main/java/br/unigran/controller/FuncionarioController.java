package br.unigran.controller;

import br.unigran.controlerDTO.FuncionarioDTO;
import br.unigran.dao.FuncionarioDao;
import br.unigran.entities.Funcionario;
import br.unigran.impl.FuncionarioImpl;
import br.unigran.utils.EstadoAplicacao;

import java.util.List;

public class FuncionarioController {
    FuncionarioDao dao = new FuncionarioImpl();
    public void salvar(FuncionarioDTO func) throws Exception {
        dao.salvar(func.builder());
        //new FuncionarioDTO().setCargo("AAAAA").setNomeFuncionario("").builder();
    }
    public List<FuncionarioDTO> listar(FuncionarioDTO funcionarioDTO) throws Exception {
        return dao.listar(funcionarioDTO.builder()).stream().map(FuncionarioDTO::new).toList();
    }
    public FuncionarioDTO buscar(long id) throws Exception {
        return new FuncionarioDTO(dao.listarId(id));
    }
    public void alterar(FuncionarioDTO funcionarioDTO) throws Exception {
         dao.atualiza(funcionarioDTO.builder());
    }
    public void login(FuncionarioDTO funcionarioDTO) throws Exception {
        EstadoAplicacao.instancia.setLogado(funcionarioDTO.builder());
    }
}
