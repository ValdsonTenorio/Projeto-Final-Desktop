package br.unigran.controller;

import br.unigran.controllerDTO.FuncionarioDTO;
import br.unigran.dao.FuncionarioDao;
import br.unigran.entities.Funcionario;
import br.unigran.impl.FuncionarioImpl;
import br.unigran.utils.EstadoAplicacao;

import java.util.List;

public class FuncionarioController {

    public static final FuncionarioController INSTANCE = new FuncionarioController();

    private FuncionarioController(){

    }

    FuncionarioDao dao = new FuncionarioImpl();

    public void salvar(FuncionarioDTO func) throws Exception {
        dao.salvar(func.builder());
        //new FuncionarioDTO().setCargo("AAAAA").setNomeFuncionario("").builder();
    }

    public List<FuncionarioDTO> listar() throws Exception {
        return dao.listar().stream().map(FuncionarioDTO::new).toList();
    }

    public FuncionarioDTO buscar(long id) throws Exception {
        return new FuncionarioDTO(dao.listarId(id));
    }

    public void alterar(FuncionarioDTO funcionarioDTO) throws Exception {
         dao.atualiza(funcionarioDTO.builder());
    }

    public List<FuncionarioDTO> listarNome(String nome) throws Exception {
        return dao.listarNome(nome).stream().map(FuncionarioDTO::new).toList();
    }
    
    public FuncionarioDTO buscaPorEmailSenha(String email, String senha){
        return new FuncionarioDTO(dao.buscarPorEmailSenha(email, senha));
    }

    public List<FuncionarioDTO> listarOrdenado(boolean asc){
        return dao.listarOrdenado(asc).stream().map(FuncionarioDTO::new).toList();
    }

    public void remover(FuncionarioDTO toRemove){
        dao.remove(toRemove.builder());
    }
}
