//Matías Ohanian 305720 && Valentino Barreiro 308473 

package dominio;

public class Tematica {

    private String nombre;
    private String descripcion;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tematica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Tematica() {
        
    }

    @Override
    public String toString(){
        return this.nombre;
    }
    
    @Override
    public boolean equals(Object o){
        Tematica t = (Tematica) o;
        return this.getNombre().equals(t.getNombre());
    }
}
