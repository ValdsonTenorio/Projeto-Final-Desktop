/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.view.subview.listar;

import br.unigran.controller.ProdutoController;
import br.unigran.view.Components.TableListagemAbstrato;
import br.unigran.view.ListagemGeneric;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laboratorio
 */
public class ListarProdutos extends TableListagemAbstrato {

    @Override
    public void setupModel(DefaultTableModel modelo, JTable table) {
        modelo.addColumn("Id");
        modelo.addColumn("Categoria");
        modelo.addColumn("Validade");
        modelo.addColumn("Quantidade");
        modelo.addColumn("Valor");
    }

    @Override
    public void listar(DefaultTableModel modelo, JTable table, String nome) {
        try {
            modelo.setRowCount(0);
            
            ProdutoController controller = new ProdutoController();
            
            controller.listarNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
