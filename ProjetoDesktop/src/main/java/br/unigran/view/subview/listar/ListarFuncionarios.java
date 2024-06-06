/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.view.subview.listar;

import br.unigran.controller.FuncionarioController;
import br.unigran.controllerDTO.FuncionarioDTO;
import br.unigran.view.Components.TableListagemAbstrato;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author laboratorio
 */
public class ListarFuncionarios extends TableListagemAbstrato {

    @Override
    public void setupModel(DefaultTableModel modelo, JTable table) {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Cargo");
    }

    @Override
    public void cadastrar() {
        new CadastroGeneric("Cadastrar Funcionáraio", new CadastroFuncionario()).setVisible(true);
    }

    @Override
    public void excluir(DefaultTableModel modelo, JTable table, int row) {
        Long id = Long.parseLong(modelo.getValueAt(row, 0).toString());
        try {
            FuncionarioController.INSTANCE.remover(FuncionarioController.INSTANCE.buscar(id));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao remover funcionario", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void alterar(DefaultTableModel modelo, JTable table, int row) {
        Long id = Long.parseLong(modelo.getValueAt(row, 0).toString());
        try {
            new CadastroGeneric("Editar Funcionáraio", new CadastroFuncionario(FuncionarioController.INSTANCE.buscar(id))).setVisible(true);
        } catch (Exception e) {

        }
    }

    @Override
    public void listar(DefaultTableModel modelo, JTable table, String nome, boolean asc) {
        try {
            modelo.setRowCount(0);

            for (FuncionarioDTO funcDTO : FuncionarioController.INSTANCE.listarOrdenado(asc)) {
                modelo.addRow(new Object[]{
                        funcDTO.getId(),
                        funcDTO.getCpf(),
                        funcDTO.getNomeFuncionario(),
                        funcDTO.getCargo()
                });
            }

            FuncionarioController.INSTANCE.listarNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(ListarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
