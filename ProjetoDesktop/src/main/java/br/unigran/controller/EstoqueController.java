package br.unigran.controller;

import br.unigran.controlerDTO.EstoqueDTO;
import br.unigran.dao.EstoqueDao;
import br.unigran.impl.EstoqueImpl;

import java.util.List;

public class EstoqueController {

    public static final EstoqueController INSTANCE = new EstoqueController();

    public EstoqueController(){

    }

    EstoqueDao dao = new EstoqueImpl();
    public void salvar(EstoqueDTO estoque) throws Exception {
        dao.salvar(estoque.builder());
        //new EstoqueDao().setCargo("AAAAA").setNomeFuncionario("").builder();
    }
    public List<EstoqueDTO> listar() throws Exception {
        return dao.listar().stream().map(EstoqueDTO::new).toList();
    }
    public EstoqueDTO buscar(long id) throws Exception {
        return new EstoqueDTO(dao.listarId(id));
    }

}
