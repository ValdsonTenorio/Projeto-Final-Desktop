package br.unigran.controllerDTO;

import br.unigran.entities.Validade;

public class ValidadeDTO {

    public String data_fabricacao;

    public Validade builder(){
        Validade validade = new Validade();

        validade.setData_fabricacao(data_fabricacao);

        return validade;
    }

}
