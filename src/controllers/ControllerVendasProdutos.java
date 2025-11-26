/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import bean.JceVendasProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerVendasProdutos extends AbstractTableModel {

    private List lstPedProd;

    public void setList(List lstPedidos) {
        this.lstPedProd = lstPedidos;
    }

    public JceVendasProdutos getBean(int rowIndex) {
        return (JceVendasProdutos) lstPedProd.get(rowIndex);
    }

    public void addBean(JceVendasProdutos jceVendasProdutos) {
        this.lstPedProd.add(jceVendasProdutos);
    }

    public void removeBean(int rowIndex) {
        this.lstPedProd.remove(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lstPedProd.size();

    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JceVendasProdutos jceVendasProdutos = (JceVendasProdutos) lstPedProd.get(rowIndex);
        if (columnIndex == 0) {
            return jceVendasProdutos.getIdjceVendasProdutos();
        } else if (columnIndex == 1) {
            return jceVendasProdutos.getJceHqs();
        } else if (columnIndex == 2) {
            return jceVendasProdutos.getJceQuantidade();
        } else if (columnIndex == 3) {
            return jceVendasProdutos.getJceValorUnitario();
        } else if (columnIndex == 4) {
            return jceVendasProdutos.getJceQuantidade() * jceVendasProdutos.getJceValorUnitario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Produto";
        } else if (columnIndex == 2) {
            return "Quantidade";
        } else if (columnIndex == 3) {
            return "Valor Unitário";
        } else if (columnIndex == 4) {
            return "Total";
        }
        return "";
    }

}
