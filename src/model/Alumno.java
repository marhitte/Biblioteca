/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author pc
 */
public class Alumno implements Serializable {
    private String matricula;
    private String nombre;
    private Fecha fechita;

    public Alumno(String a, String b, Fecha c){
        a=this.matricula;
        b=this.nombre;
        c=this.fechita;
    }
    
    public String toString(){
        return String.format("%s \t %s \t %s", matricula,nombre,fechita);
    }
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechita
     */
    public Fecha getFechita() {
        return fechita;
    }

    /**
     * @param fechita the fechita to set
     */
    public void setFechita(Fecha fechita) {
        this.fechita = fechita;
    }
    
}
