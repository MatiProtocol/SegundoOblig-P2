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
        //ventana
    }

    @Override
    public String toString(){
        return this.nombre;
    }
    
}
