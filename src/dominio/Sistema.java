package dominio;

import java.util.*;

/**
 *
 * @author alumnoFI
 */
public class Sistema {

    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Postulante> postulantes;
    private ArrayList<Tematica> tematicas;

    public Sistema() {
        this.postulantes = new ArrayList<Postulante>();
        this.tematicas = new ArrayList<>();
    }

    public ArrayList<Postulante> getPostulantes() {
        return postulantes;
    }

    public void addPostulantes(Postulante postulantes) {
        this.postulantes.add(postulantes);
    }

    public ArrayList<Tematica> getTematicas() {
        return tematicas;
    }

    public void addTematicas(Tematica tematica) {
        this.tematicas.add(tematica);
    }

    public int getSizeTematicas() {
        return tematicas.size();
    }

    public int getSizePostulantes() {
        return postulantes.size();
    }

    public ArrayList<Evaluador> getEvaluadores() {
        return evaluadores;
    }
    public int getSizeEvaluador() {
        return evaluadores.size();
    }

    public void addEvaluador(Evaluador evaluador) {
        this.evaluadores.add(evaluador);
    }
}
