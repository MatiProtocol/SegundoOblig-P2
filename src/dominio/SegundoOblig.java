
//Matías Ohanian 305720 && Valentino Barreiro 308473 
package dominio;


import dominio.*;
import interfaz.Inicio;
import java.io.*;


public class SegundoOblig {


    public static void main (String[] args) {
       Sistema sistema = new Sistema();
       Inicio v = new Inicio(sistema);
       v.setVisible(true);
       
       /*try{
           ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(".\\Guardado.txt"));
           output.writeObject(sistema);
           output.close();
       }catch (FileNotFoundException e){
           e.getMessage();
           System.out.println("No se logró guardar los datos.");
       }catch(IOException e){
           e.getMessage();
           System.out.println("No se logró guardar los datos.");
       }
         */  
    }
    
}
