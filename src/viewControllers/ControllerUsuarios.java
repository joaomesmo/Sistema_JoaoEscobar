/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewControllers;

import bean.JceUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcos
 */
public class ControllerUsuarios extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public JceUsuarios getBean(int rowIndex) {
       return (JceUsuarios) lista.get(rowIndex);   
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
        JceUsuarios jceUsuarios = (JceUsuarios) lista.get( rowIndex);
        if ( columnIndex == 0 ){
            return jceUsuarios.getJceIdusuarios();
        } else if (columnIndex ==1) {
            return jceUsuarios.getJceNome();        
        } else if (columnIndex ==2) {
            return jceUsuarios.getJceApelido();
        } else if (columnIndex ==3) {
            return jceUsuarios.getJceDataNascimento();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        }
        else if (column == 1) {
            return "Nome";
        }
        else if (column == 2) {
            return "Apelido";
        }
        else if (column == 3) {
            return "Data Nascimento";
        }
        return "";
    }
}
