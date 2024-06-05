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

    public ProdutoDTO() {
    }

    
    
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

    public ProdutoDTO(Produto produto){
        this.marca = produto.getMarca();
        this.categoria = produto.getCategoria();
        this.fornecedor = produto.getFornecedor();
        this.validadeProd = produto.getValidadeProd();
        this.qtdeRecebida = produto.getQtdeRecebida();
        this.qtdeMinEstoque = produto.getQtdeMinEstoque();
        this.valorProd = produto.getValorProd();
        this.valorVenda = produto.getValorVenda();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getValidadeProd() {
        return validadeProd;
    }

    public void setValidadeProd(String validadeProd) {
        this.validadeProd = validadeProd;
    }

    public int getQtdeRecebida() {
        return qtdeRecebida;
    }

    public void setQtdeRecebida(int qtdeRecebida) {
        this.qtdeRecebida = qtdeRecebida;
    }

    public int getQtdeMinEstoque() {
        return qtdeMinEstoque;
    }

    public void setQtdeMinEstoque(int qtdeMinEstoque) {
        this.qtdeMinEstoque = qtdeMinEstoque;
    }

    public Double getValorProd() {
        return valorProd;
    }

    public void setValorProd(Double valorProd) {
        this.valorProd = valorProd;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    
    
}
