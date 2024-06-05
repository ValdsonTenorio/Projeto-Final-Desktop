package br.unigran.entities;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codProd;
    @Column(length = 50)
    private String marca;
    @Column(length = 50)
    private String categoria;
    @Column(length = 50)
    private String fornecedor;
    @Column(length = 50)
    private String validadeProd;
    private int qtdeRecebida;
    private int qtdeMinEstoque;
    private Double valorProd;
    private Double valorVenda;

    public Produto(Long codProd, String marca, String categoria, String fornecedor, String validadeProd, int qtdeRecebida, int qtdeMinEstoque, Double valorProd, Double valorVenda) {
        this.codProd = codProd;
        this.marca = marca;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.validadeProd = validadeProd;
        this.qtdeRecebida = qtdeRecebida;
        this.qtdeMinEstoque = qtdeMinEstoque;
        this.valorProd = valorProd;
        this.valorVenda = valorVenda;
    }

    public Produto() {

    }

    public Long getCodProd() {
        return codProd;
    }

    public void setCodProd(Long codProd) {
        this.codProd = codProd;
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

    public void cadastrar(){

    }

    public void alterar(){

    }

    public void buscar(){

    }

    public ArrayList<Produto> listar(){
        return null;
    }
}