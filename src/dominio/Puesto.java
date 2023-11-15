/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.*;

/**
 *
 * @author matib
 */
public class Puesto {

    private String nombre;
    private String tipo; //remoto presencial o mxto de los radio botones
    private ArrayList<Tematica> temasRequeridos;

    public Puesto () {
    }

    public Puesto (String nombre, String tipo, ArrayList<Tematica> temasRequeridos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.temasRequeridos = temasRequeridos;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getTipo () {
        return tipo;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Tematica> getTemasRequeridos () {
        return temasRequeridos;
    }

    public void setTemasRequeridos (ArrayList<Tematica> temasRequeridos) {
        this.temasRequeridos = temasRequeridos;
    }

    public void addTemaRequerido (Tematica unT) {
        this.temasRequeridos.add(unT);
    }
    
  
}
