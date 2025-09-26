/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u07881654104
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes){
        for (int i = 0; i < componentes.length; i ++){
            componentes[i].setEnabled(valor);
        }
    }
    
    public static void limpar(JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JComboBox) {
            ((JComboBox) componentes[i]).setSelectedIndex(-1);
            }
        }
    }
    public static void mensagem(String cad){
        JOptionPane.showMessageDialog(null, cad);
    }
    public static boolean perguntar (String cad){
        int resp = JOptionPane.showConfirmDialog(null, cad, "Confirmação", JOptionPane.YES_NO_OPTION);
        return resp == JOptionPane.YES_OPTION;
    }
    
    // Converte String para int
    public static int strToInt(String num){
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            mensagem("Valor inválido para inteiro!");
            return 0;
        }
    }
    
    // Converte int para String
    public static String intToStr(int num){
        return String.valueOf(num);
    }
    
    // Converte double para String
    public static String doubleToStr(double num){
        return String.valueOf(num);
    }
    
    // Converte String para double
    public static double strToDouble(String num){
        try {
            return Double.parseDouble(num.replace(",", "."));
        } catch (NumberFormatException e) {
            mensagem("Valor inválido para número!");
            return 0.0;
        }
    }
    
    // Converte String para Date (formato dd/MM/yyyy)
    public static Date strToDate(String data){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse(data);
        } catch (ParseException e) {
            mensagem("Data inválida! Use o formato dd/MM/yyyy.");
            return null;
        }
    }
    
    // Converte Date para String (formato dd/MM/yyyy)
    public static String dateToStr(Date data){
        if (data == null) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }
    
}
