package br.unigran.controller;

import br.unigran.controllerDTO.ProdutoDTO;
import br.unigran.dao.ProdutoDao;
import br.unigran.entities.Produto;
import br.unigran.impl.ProdutoImpl;
import java.util.List;
import javax.persistence.NoResultException;

public class ProdutoController {

    ProdutoDao dao = new ProdutoImpl();

    public void salvar(ProdutoDTO prod) throws Exception {
        dao.salvar(prod.builder());
    }
    public List<ProdutoDTO> listar() throws Exception {
        return dao.listar().stream().map(ProdutoDTO::new).toList();
    }
    public ProdutoDTO buscar(long id) throws Exception {
        return new ProdutoDTO(dao.listarId(id));
    }
    public void alterar(ProdutoDTO funcionarioDTO) throws Exception {
         dao.atualiza(funcionarioDTO.builder());
    }
       public List<ProdutoDTO> listarNome(String nome) throws Exception {
        return dao.listarNome(nome).stream().map(ProdutoDTO::new).toList();
    }
}
