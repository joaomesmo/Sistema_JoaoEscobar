/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewControllers;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07881654104
 */
public class ControllerVendas extends AbstractTableModel {

    List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public Object getBean(int rowIndex) {
       return lista.get(rowIndex);    
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
        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        }
        if (column == 1) {
            return "Numero do pedido";
        }
        if (column == 2) {
            return "Clientes";
        }
        if (column == 3) {
            return "Produtoras";
        }
        return "";
    }
}
