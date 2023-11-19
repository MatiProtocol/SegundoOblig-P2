//Matías Ohanian 305720 && Valentino Barreiro 308473 
package dominio;

import java.io.Serializable;

public class Entrevista implements Serializable {

    private static int indexEntrevista = 0;
    private Evaluador evaluador;
    private Postulante postulante;
    private String descripcion;
    private int puntaje;

    public int getPuntaje () {
        return puntaje;
    }

    public void setPuntaje (int puntaje) {
        this.puntaje = puntaje;
    }

    public int getIndexEntrevista () {
        return indexEntrevista;
    }

    public Evaluador getEvaluador () {
        return evaluador;
    }

    public void setEvaluador (Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public Postulante getPostulante () {
        return postulante;
    }

    public void setPostulante (Postulante postulante) {
        this.postulante = postulante;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    public Entrevista (Evaluador evaluador, Postulante postulante, String descripcion) {
        this.indexEntrevista++;
        this.evaluador = evaluador;
        this.postulante = postulante;
        this.descripcion = descripcion;
    }

    public Entrevista () {
    }

}
