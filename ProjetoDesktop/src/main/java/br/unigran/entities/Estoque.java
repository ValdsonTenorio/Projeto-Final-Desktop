/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author valds
 */
@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long estoqueAtual;
    private Long estoqueAnterior;

    @OneToMany(mappedBy = "estoque")
    private Set<Funcionario> funcionarios = new HashSet<>();

    @OneToMany(mappedBy = "estoque")
    private Set<Produto> produtos = new HashSet<>();

    @OneToMany(mappedBy = "estoque")
    private Set<Entrada> entradas = new HashSet<>();

    @OneToMany(mappedBy = "estoque")
    private Set<Saida> saidas = new HashSet<>();

    public void setEstoqueAtual(Long estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public Long getEstoqueAtual() {
        return estoqueAtual;
    }

    public Long getEstoqueAnterior() {
        return estoqueAnterior;
    }

    public void setEstoqueAnterior(Long estoqueAnterior) {
        this.estoqueAnterior = estoqueAnterior;
    }


    public void acessar(){

    }
    public void entrada(){

    }
    public void buscar(){

    }
    public void saida(){

    }
    public void listar(){

    }
}