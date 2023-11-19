//Matías Ohanian 305720 && Valentino Barreiro 308473 
package dominio;

import java.io.Serializable;

public class Evaluador implements Serializable {

    private String nombre;
    private String cedula;
    private String direccion;
    private int anoIngreso;

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getCedula () {
        return cedula;
    }

    public void setCedula (String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion () {
        return direccion;
    }

    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }

    public int getAnoIngreso () {
        return anoIngreso;
    }

    public void setAnoIngreso (int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    public Evaluador () {
    }

    public Evaluador (String nombre, String cedula, String direccion, int anoIngreso) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.anoIngreso = anoIngreso;
    }

    public String getNombreCedula () {
        return this.nombre + " (" + this.cedula + ")";
    }

}
