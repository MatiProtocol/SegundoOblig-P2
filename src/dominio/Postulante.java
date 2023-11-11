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
    private ArrayList<Tematica> conocimientos;
    private ArrayList<Integer> nivel;
    private ArrayList<Entrevista> entrevistas;

    public ArrayList<Entrevista> getEntrevistas () {
        return entrevistas;
    }
    
    public void addEntrevista (Entrevista unaE){
        this.entrevistas.add(unaE);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public Postulante() {
    }

    public Postulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedIn) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
        this.linkedIn = linkedIn;
        this.conocimientos = new ArrayList<>();
        this.nivel = new ArrayList<>();
    }

    public void addConocimiento(Tematica unaT) {
        this.conocimientos.add(unaT);
    }

    public void addNivel(int unN) {
        this.nivel.add(unN);
    }

    public ArrayList<Tematica> getConocimiento() {
        return this.conocimientos;
    }

    public ArrayList<Integer> getNiveles() {
        return this.nivel;
    }

    public void setConocimientos(ArrayList<Tematica> conocimientos) {
        this.conocimientos = conocimientos;
    }

    public void setNivel(ArrayList<Integer> nivel) {
        this.nivel = nivel;
    }

}
