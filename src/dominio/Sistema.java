//Matías Ohanian 305720 && Valentino Barreiro 308473 
package dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Sistema implements Serializable {

    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Postulante> postulantes;
    private ArrayList<Tematica> tematicas;
    private ArrayList<Entrevista> entrevistas;
    private ArrayList<Puesto> puestos;

    public Sistema () {
        this.postulantes = new ArrayList<Postulante>();
        this.tematicas = new ArrayList<>();
        this.evaluadores = new ArrayList<>();
        this.entrevistas = new ArrayList<>();
        this.puestos = new ArrayList<>();
    }

    public ArrayList<Postulante> getPostulantes () {
        return postulantes;
    }

    public void addPostulantes (Postulante postulantes) {
        this.postulantes.add(postulantes);
    }

    public ArrayList<Tematica> getTematicas () {
        return tematicas;
    }

    public void addTematicas (Tematica tematica) {
        this.tematicas.add(tematica);
    }

    public ArrayList<Evaluador> getEvaluadores () {
        return evaluadores;
    }

    public void addEvaluador (Evaluador evaluador) {
        this.evaluadores.add(evaluador);
    }

    public ArrayList<Entrevista> getEntrevistas () {
        return this.entrevistas;
    }

    public void addEntrevista (Entrevista unaE) {
        this.entrevistas.add(unaE);
    }

    public ArrayList<Puesto> getPuestos () {
        return this.puestos;
    }

    public void addPuesto (Puesto unP) {
        this.puestos.add(unP);
    }

    public int getSizeEntrevistas () {
        return entrevistas.size();
    }

    public int getSizeEvaluador () {
        return evaluadores.size();
    }

    public int getSizeTematicas () {
        return tematicas.size();
    }

    public int getSizePostulantes () {
        return postulantes.size();
    }

    public void serealizarSist () {
        try {
            
            
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(".\\Guardado"));
            output.writeObject(this);
            output.close();
            
        } catch (FileNotFoundException e) {
            e.getMessage();
            System.out.println("No se logró guardar los datos.");
        } catch (IOException e) {
            e.getMessage();
            System.out.println("No se logró guardar los datos.");
        }
    }
}
