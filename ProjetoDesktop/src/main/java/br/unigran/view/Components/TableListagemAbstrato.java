/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.view.Components;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laboratorio
 */
public abstract class TableListagemAbstrato{
    
    public abstract void setupModel(DefaultTableModel modelo, JTable table);
    public abstract void listar(DefaultTableModel modelo, JTable table, String nome);
}
