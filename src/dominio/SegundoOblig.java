package dominio;

//import dominio.Postulante;
import dominio.*;
import interfaz.Inicio;


public class SegundoOblig {


    public static void main (String[] args) {
       Sistema sistema = new Sistema();
       Inicio v = new Inicio(sistema);
       v.setVisible(true);

    }
    
}
