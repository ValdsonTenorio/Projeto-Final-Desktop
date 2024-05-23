package br.unigran.controller;

import br.unigran.controlerDTO.EstoqueDTO;
import br.unigran.dao.EstoqueDao;
import br.unigran.impl.EstoqueImpl;

import java.util.List;

public class EstoqueController {
    EstoqueDao dao = new EstoqueImpl();
    public void salvar(EstoqueDTO estoque) throws Exception {
        dao.salvar(estoque.builder());
        //new EstoqueDao().setCargo("AAAAA").setNomeFuncionario("").builder();
    }
    public List<EstoqueDTO> listar(EstoqueDTO estoqueDTO) throws Exception {
        return dao.listar(estoqueDTO.builder()).stream().map(EstoqueDTO::new).toList();
    }
    public EstoqueDTO buscar(long id) throws Exception {
        return new EstoqueDTO(dao.listarId(id));
    }

}
