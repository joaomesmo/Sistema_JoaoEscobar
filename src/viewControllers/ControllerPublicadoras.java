/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewControllers;

import bean.JcePublicadoras;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Caio
 */
public class ControllerPublicadoras extends AbstractTableModel {
    List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public JcePublicadoras getBean(int rowIndex) {
       return (JcePublicadoras) lista.get(rowIndex);
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
        JcePublicadoras jcePublicadoras = (JcePublicadoras) lista.get( rowIndex);
        if ( columnIndex == 0 ){
            return jcePublicadoras.getJceIdpublicadoras();
        } else if (columnIndex ==1) {
            return jcePublicadoras.getJceNome();        
        } else if (columnIndex ==2) {
            return jcePublicadoras.getJceEmail();
        } else if (columnIndex ==3) {
            return jcePublicadoras.getJceTelefone();
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
            return "email";
        }
        if (column == 3) {
            return "telefone";
        }
        return "";
    }
}