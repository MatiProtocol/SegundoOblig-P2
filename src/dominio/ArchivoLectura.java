/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Matías Ohanian 305720 && Valentino Barreiro 308473 
package dominio;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArchivoLectura {

    private Scanner in = new Scanner(System.in);
    private String lineaActual;

    public ArchivoLectura (String unNombre) {
        try {
            Scanner searchFile = new Scanner(Paths.get(unNombre));
        } catch (IOException e) {
            System.err.println("segmentation fault: core dump");
            System.exit(1);
        }
    }

    public boolean hayMasLineas () {
        boolean hay = false;
        lineaActual = null;

        if (in.hasNext()) {
            lineaActual = in.nextLine();
            hay = true;
        }

        return hay;
    }

    public String ultimaLineaLeida () {
        return this.lineaActual;
    }

    public void cerrar () {
        in.close();
    }

    //listar archivo
    public void listar (String nombre, int n) {
        ArchivoLectura al = new ArchivoLectura(nombre);

        while (al.hayMasLineas()) {
            for (int i = 0; i < n; i++) {
                System.out.print(al.ultimaLineaLeida() + " ");
            }

            System.out.println("");
        }

        al.cerrar();

    }
}
