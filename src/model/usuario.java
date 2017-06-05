/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import model.rol;

/**
 *
 * @author pc
 */
public class usuario {
    private String login;
    private String pass;
    private String email;
    private HashSet<rol> permisos;
    
    public usuario(String log,String pas,String ema){
        this.login=log;
        this.pass=pas;
        this.email=ema;        
        permisos=new HashSet<>();
    }
    
    public void agregarPermiso(){
        getPermisos().add(rol);
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the permisos
     */
    public HashSet<rol> getPermisos() {
        return permisos;
    }

    /**
     * @param permisos the permisos to set
     */
    public void setPermisos(HashSet<rol> permisos) {
        this.permisos = permisos;
    }
    
    
}
