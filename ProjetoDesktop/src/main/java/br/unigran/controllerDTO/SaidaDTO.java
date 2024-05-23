package br.unigran.controllerDTO;

import br.unigran.entities.Saida;

public class SaidaDTO {

    public long id;
    public String motivoSaida;
    public String dataSaida;

    public Saida builder(){
        Saida saida = new Saida();

        saida.setMotivoSaida(motivoSaida);
        saida.setDataSaida(dataSaida);

        return saida;
    }
    
}
