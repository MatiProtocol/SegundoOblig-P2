//Matías Ohanian 305720 && Valentino Barreiro 308473 
package dominio;

import java.io.*;
import java.util.Formatter;

public class ArchivoGrabacion {

    private Formatter out;

    public ArchivoGrabacion (String unNombre) {
        try {
            out = new Formatter(unNombre);
        } catch (FileNotFoundException e) {
            System.out.println("No se puede crear");
            System.exit(1);
        }
    }

    public ArchivoGrabacion (String unNombre, boolean extender) {
        try {
            FileWriter myFileWriter = new FileWriter(unNombre, extender);
            out = new Formatter(myFileWriter);
        } catch (IOException e) {
            System.out.println("No se puede crear/extender");
            System.exit(1);
        }
    }

    public void grabarLinea (String unaLinea) {
        out.format("%s%n", unaLinea);
    }

    public void cerrar () {
        out.close();

    }
}
