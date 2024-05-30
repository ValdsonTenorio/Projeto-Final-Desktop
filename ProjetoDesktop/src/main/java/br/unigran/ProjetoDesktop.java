/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unigran;

import br.unigran.view.CadastroGeneric;
import br.unigran.view.ListagemGeneric;
import br.unigran.view.subview.cadastros.CadastroProduto;
import br.unigran.view.subview.listar.ListarFuncionarios;
import br.unigran.view.subview.listar.ListarProdutos;

/**
 *
 * @author laboratorio
 */
public class ProjetoDesktop {

    public static void main(String[] args) {
       new ListagemGeneric(new ListarFuncionarios()).setVisible(true);
    }
}
