
package dominio;

import java.util.*;

/**
 *
 * @author alumnoFI
 */
public class Sistema {
    private ArrayList<Postulante> postulantes; 
    private ArrayList<Tematica> tematicas;

    public ArrayList<Postulante> getPostulantes() {
        return postulantes;
    }

    public Sistema() {
        this.postulantes = new ArrayList<Postulante>();
        this.tematicas = new ArrayList<>();
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
    
    
    
    
}
