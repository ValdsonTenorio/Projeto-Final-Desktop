package br.unigran.entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author valds
 */
@Entity
public class Validade{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 30)
    private String data_fabricacao;

    @OneToMany(mappedBy = "produto")
    private Set<Produto> produtos = new HashSet<>();

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