package br.unigran.controller;

import br.unigran.controllerDTO.ProdutoDTO;
import br.unigran.dao.ProdutoDao;
import br.unigran.entities.Produto;
import br.unigran.impl.ProdutoImpl;
import java.util.List;
import javax.persistence.NoResultException;

public class ProdutoController {

    ProdutoDao dao = new ProdutoImpl() {
        @Override
        public List<Produto> listar(Produto builder) throws NoResultException {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };

    public void salvar(ProdutoDTO prod) throws Exception {
        dao.salvar(prod.builder());
    }


}
