package br.unigran.controller;

import br.unigran.controllerDTO.ProdutoDTO;
import br.unigran.dao.ProdutoDao;
import br.unigran.impl.ProdutoImpl;

public class ProdutoController {

    ProdutoDao dao = new ProdutoImpl();

    public void salvar(ProdutoDTO prod) throws Exception {
        dao.salvar(prod.builder());
    }


}
