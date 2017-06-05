/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;

/**
 *
 * @author pc
 */
public class entr {
    public static void main(String[] args) {
        7
 
        HashSet<rol> grants= new HashSet<>();7
                grants.add(rol.ENTREGA);
                
            System.out.println(grants.contains(rol.ENTREGA));
            
            for (rol grant : grants) {
                System.out.println(grant);
        }
                
        
    }
}
