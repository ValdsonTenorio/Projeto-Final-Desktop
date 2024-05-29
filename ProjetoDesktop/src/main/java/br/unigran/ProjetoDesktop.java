/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unigran;

import br.unigran.view.CadastroGeneric;
import br.unigran.view.subview.cadastros.CadastroFuncionario;
import br.unigran.view.subview.cadastros.CadastroProduto;

/**
 *
 * @author laboratorio
 */
public class ProjetoDesktop {

    public static void main(String[] args) {
       new CadastroGeneric("Produto", new CadastroProduto()).setVisible(true);
    }
}
