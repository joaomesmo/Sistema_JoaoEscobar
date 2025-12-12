/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import bean.JceClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Caio
 */
public class ControllerClientes extends AbstractTableModel {
    List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public JceClientes getBean(int rowIndex) {
       return (JceClientes) lista.get(rowIndex);  
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JceClientes jceClientes = (JceClientes) lista.get( rowIndex);
        if ( columnIndex == 0 ){
            return jceClientes.getIdjceClientes();
        } else if (columnIndex ==1) {
            return jceClientes.getJceNome();        
        } else if (columnIndex ==2) {
            return jceClientes.getJceApelido();
        } else if (columnIndex ==3) {
            return jceClientes.getJceTelefone();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Status";
        }
        if (column == 3) {
            return "Telefone";
        }
        return "";
    }
}

