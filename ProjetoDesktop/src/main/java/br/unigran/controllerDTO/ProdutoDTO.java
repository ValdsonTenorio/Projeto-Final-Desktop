package br.unigran.controllerDTO;

import br.unigran.entities.Produto;

public class ProdutoDTO {

    public String marca;
    public String categoria;
    public String fornecedor;
    public String validadeProd;
    public int qtdeRecebida;
    public int qtdeMinEstoque;
    public Double valorProd;
    public Double valorVenda;

    public Produto builder(){
        Produto produto = new Produto();

        produto.setCategoria(categoria);
        produto.setFornecedor(fornecedor);
        produto.setMarca(marca);
        produto.setValidadeProd(validadeProd);
        produto.setQtdeRecebida(qtdeRecebida);
        produto.setQtdeMinEstoque(qtdeMinEstoque);
        produto.setValorProd(valorProd);
        produto.setValorVenda(valorVenda);

        return produto;
    }

}
