//Matías Ohanian 305720 && Valentino Barreiro 308473 
package interfaz;


import dominio.*;
import dominio.Sistema;
import interfaz.Inicio;



public class SegundoOblig {


    public static void main (String[] args) {
       Sistema sistema = new Sistema();
       Inicio v = new Inicio(sistema);
       v.setVisible(true);
               
    }  
}
