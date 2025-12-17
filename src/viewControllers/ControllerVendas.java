/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewControllers;

import bean.JceVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07881654104
 */

public class ControllerVendas extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public JceVendas getBean(int rowIndex) {
       return (JceVendas) lista.get(rowIndex);  
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
        JceVendas jceVendas = (JceVendas) lista.get( rowIndex);
        if ( columnIndex == 0 ){
            return jceVendas.getJceIdvendas();
        } else if (columnIndex ==1) {
            return jceVendas.getJceData();        
        } else if (columnIndex ==2) {
            return jceVendas.getJceTotal();
        } else if (columnIndex ==3) {
            return jceVendas.getJceClientes().getJceNome();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        }
        if (column == 1) {
            return "Data da venda";
        }
        if (column == 2) {
            return "Total";
        }
        if (column == 3) {
            return "Clientes";
        }
        return "";
    }
}
