/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import bean.JceHqs;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Caio
 */
public class ControllerHQs extends AbstractTableModel {
    
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public JceHqs getBean(int rowIndex) {
       return (JceHqs) lista.get(rowIndex);     
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
        JceHqs jceHqs = (JceHqs) lista.get( rowIndex);
        if ( columnIndex == 0 ){
            return jceHqs.getJceIdhqs();
        } else if (columnIndex ==1) {
            return jceHqs.getJceNome();        
        } else if (columnIndex ==2) {
            return jceHqs.getJceCriador();
        } else if (columnIndex ==3) {
            return jceHqs.getJcePublicadora();
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
            return "criador";
        }
        if (column == 3) {
            return "publicadora";
        }
        return "";
    }
}