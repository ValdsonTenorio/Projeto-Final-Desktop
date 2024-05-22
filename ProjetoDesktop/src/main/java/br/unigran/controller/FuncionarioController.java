package br.unigran.controller;

import br.unigran.controlerDTO.FuncionarioDTO;
import br.unigran.dao.FuncionarioDao;
import br.unigran.impl.FuncionarioImpl;

import java.util.List;

public class FuncionarioController {
    FuncionarioDao dao = new FuncionarioImpl();
    public void salvar(FuncionarioDTO func) throws Exception {
        dao.salvar(func.builder());
    }

}
