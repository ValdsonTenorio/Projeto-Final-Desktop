/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.view.subview.listar;

import br.unigran.controller.FuncionarioController;
import br.unigran.view.Components.TableListagemAbstrato;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laboratorio
 */
public class ListarFuncionarios extends TableListagemAbstrato{

       @Override
    public void setupModel(DefaultTableModel modelo, JTable table) {
        modelo.addColumn("Id");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Cargo");
    }

    @Override
    public void listar(DefaultTableModel modelo, JTable table, String nome) {
           try {
               modelo.setRowCount(0);
               
               FuncionarioController controller = new FuncionarioController();
               
               controller.listarNome(nome);
           } catch (Exception ex) {
               Logger.getLogger(ListarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
}
