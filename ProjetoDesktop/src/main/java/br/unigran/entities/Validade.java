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
    private Long id;
    @Column(length = 30)
    private String data_fabricacao;

    @OneToMany(mappedBy = "validade")
    private Set<Produto> produtos = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(String data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
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