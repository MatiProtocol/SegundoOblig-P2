/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import javax.swing.table.*;
import javax.swing.*;
import java.awt.Component;

/**
 *
 * @author alumnoFI
 */
public class CellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component tableCellRendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (value instanceof String) {
            String string = (String) value;
            if (string.indexOf(' ') > -1) {
                setText(getHTML(string));
            }
        }
        return tableCellRendererComponent;
    }
    
    private String getHTML(String string) {
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
