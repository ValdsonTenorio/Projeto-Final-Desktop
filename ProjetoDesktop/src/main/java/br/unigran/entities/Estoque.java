/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.entities;

import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author valds
 */
public class Estoque {

    private long estoqueAtual;
    private long estoqueAnterior;

    @OneToMany(mappedBy = "funcionario")
    private Set<Funcionario> funcionarios = new HashSet<>();

    @OneToMany(mappedBy = "produto")
    private Set<Produto> produtos = new HashSet<>();

    @OneToMany(mappedBy = "entrada")
    private Set<Entrada> entradas = new HashSet<>();

    @OneToMany(mappedBy = "saida")
    private Set<Saida> saidas = new HashSet<>();

    public void setEstoqueAtual(long estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public long getEstoqueAnterior() {
        return estoqueAnterior;
    }

    public void setEstoqueAnterior(long estoqueAnterior) {
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
