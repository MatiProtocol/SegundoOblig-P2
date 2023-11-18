/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import javax.swing.table.*;
import javax.swing.*;
import java.awt.Component;
import java.util.*;
/**
 *
 * @author alumnoFI
 */
public class CellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object comentario, boolean isSelected, boolean hasFocus, int row, int column) {
        Component tableCellRendererComponent = super.getTableCellRendererComponent(table, comentario, isSelected, hasFocus, row, column);
        if (comentario instanceof String) {
            String string = (String) comentario;
            if (string.indexOf(' ') > -1) {
                
                setText(string); //de este codigo sacado en clase, acá iría el llamado a getHTML, pero al no poder hacer la configuracion del color rojo, determinamos no utilizarlo.
            }
        }
        return tableCellRendererComponent;
    }
    
    private String getHTML(String string) {
        
        //ArrayList<String> separacion = new Pintura(string);
        
            StringBuilder sb = new StringBuilder();
            sb.append("<html>");
            int posicion = 0;
            while (posicion < string.length()) {
                int siguiente = string.indexOf(' ', posicion);
                if (siguiente > -1) {
                    int fin = string.length();
                    if (fin > -1) {
                        siguiente++;
                        sb.append(string.substring(posicion, siguiente));
                        sb.append("<span style=\"color: red;\">");
                        sb.append(string.substring(siguiente, fin));
                        sb.append("</span>");
                        posicion = fin;
                    } 
                    else {
                        posicion = string.length();
                    }
                } 
                else {
                    posicion = string.length();
                }
            }
            sb.append(string.substring(posicion, string.length()));
            sb.append("</html>");
            return sb.toString();
        }
  
}