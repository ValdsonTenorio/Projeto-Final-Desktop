/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.view.subview.listar;

import br.unigran.controller.FuncionarioController;
import br.unigran.controller.ProdutoController;
import br.unigran.controllerDTO.FuncionarioDTO;
import br.unigran.controllerDTO.ProdutoDTO;
import br.unigran.utils.RelatorioUtils;
import br.unigran.view.CadastroGeneric;
import br.unigran.view.Components.TableListagemAbstrato;
import br.unigran.view.ListagemGeneric;
import br.unigran.view.subview.cadastros.CadastroFuncionario;
import br.unigran.view.subview.cadastros.CadastroProduto;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author laboratorio
 */
public class ListarProdutos extends TableListagemAbstrato {

    @Override
    public void setupModel(DefaultTableModel modelo, JTable table) {
        modelo.addColumn("id");
        modelo.addColumn("Categoria");
        modelo.addColumn("Validade");
        modelo.addColumn("Valor");
    }

    @Override
    public void listar(DefaultTableModel modelo, JTable table, String nome, boolean asc) {
        try {
            modelo.setRowCount(0);

            for (ProdutoDTO prodDTO : ProdutoController.INSTANCE.listarOrdenado(asc)) {
                modelo.addRow(new Object[]{
                        prodDTO.getCodProd(),
                        prodDTO.getCategoria(),
                        prodDTO.getValidadeProd(),
                        prodDTO.getValorProd()
                });
            }

            ProdutoController.INSTANCE.listarNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cadastrar() {
        new CadastroGeneric("Cadastrar Produto", new CadastroProduto()).setVisible(true);
    }

    @Override
    public void excluir(DefaultTableModel modelo, JTable table, int row) {
        Long id = Long.parseLong(modelo.getValueAt(row, 0).toString());
        try {
            ProdutoController.INSTANCE.remover(ProdutoController.INSTANCE.buscar(id));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao remover produto", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void alterar(DefaultTableModel modelo, JTable table, int row) {
        Long id = Long.parseLong(modelo.getValueAt(row, 0).toString());
        try {
            new CadastroGeneric("Editar Produto", new CadastroProduto(ProdutoController.INSTANCE.buscar(id))).setVisible(true);
        } catch (Exception e) {

        }
    }
    public void reportar() {
        try {
            JasperViewer.viewReport(RelatorioUtils.relatorio("relatorios/produto.jrxml",new HashMap<>()),false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro: %s".formatted(e.getMessage()));
        }
    }
}
