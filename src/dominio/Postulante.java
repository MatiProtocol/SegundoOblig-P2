package dominio;

import java.util.*;

public class Postulante {
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String mail;
    private String linkedIn;
    private String tipoTrabajo;
    private ArrayList<String> conocimientos;
    private ArrayList<Integer> nivel;

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

    public String getTelefono () {
        return telefono;
    }

    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }

    public String getMail () {
        return mail;
    }

    public void setMail (String mail) {
        this.mail = mail;
    }

    public String getLinkedIn () {
        return linkedIn;
    }

    public void setLinkedIn (String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public Postulante () {
    }

    public Postulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedIn) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
        this.linkedIn = linkedIn;
    }
    
    
}
