/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.entities;

import javax.persistence.OneToMany;

/**
 *
 * @author valds
 */
public class Estoque {
    private long estoqueAtual;
    private long estoqueAnterior;
    @OneToMany  
    public long getEstoqueAtual() {
        return estoqueAtual;
    }

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
