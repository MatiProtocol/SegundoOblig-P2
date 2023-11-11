/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author matib
 */
public class Entrevista {
    private static int indexEntrevista = 0;
    private Evaluador evaluador;
    private Postulante postulante;
    private String descripcion;

    public int getIndexEntrevista () {
        return indexEntrevista;
    }

    /*public static void setIndexEntrevista () {
        indexEntrevista  = indexEntrevista+1;
    }*/

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
