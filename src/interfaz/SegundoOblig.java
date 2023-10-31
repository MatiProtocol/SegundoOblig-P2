package interfaz;

//import dominio.Postulante;
import dominio.*;


public class SegundoOblig {


    public static void main (String[] args) {
       Sistema sistema = new Sistema();
       
       Principal v = new Principal(sistema);
       v.setVisible(true);

    }
    
}
