package br.unigran.entities;


import javax.persistence.Column;
import javax.persistence.OneToMany;

/**
 *
 * @author valds
 */
public class Validade{
    @Column(length = 30)
    private String data_fabricacao;
    @OneToMany
    public String getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(String data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }
    
      public void calcularDataFabric(){
          
      }
      public void exibirDataVenc(){
          
      }
      public void alterar(){
          
      }
      public void listar(){
          
      }
}
