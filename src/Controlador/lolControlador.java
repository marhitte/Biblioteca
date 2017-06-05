/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.HashSet;
import Modelo.Libro;
import Excepciones.LibroExistente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class lolControlador {
    
      private HashSet<Libro> libro;
    
    public lolControlador(){
        File archivo=new File("registrolib.dat");
        if(archivo.exists()){
            
        }
            
        }
    private HashSet<Libro> cargarproductos(){
        try{
            File file=new File("registrolib.dat");
            FileInputStream input = new FileInputStream(file);
            ObjectInputStream reader= new ObjectInputStream(input);
            
            HashSet<Libro> cargar= (HashSet<Libro>) reader.readObject();
            
            reader.close();
            input.close();
            
            return cargar;
        } catch(IOException ex){
            
        }catch(ClassNotFoundException ex){
            
        }
        return null;
        
    }
    public void agregar(Libro l) throws LibroExistente{
        if(!libro.add(l)){
            throw new LibroExistente();
        }
    }
    public void guardar(){
        try{
            File file=new File("registrolib.dat");
            FileOutputStream output = new FileOutputStream(file);
            ObjectOutputStream writer= new ObjectOutputStream(output);
            
            
            writer.writeObject(libro);
            writer.close();
            output.close();
            
            
        } catch(IOException ex){
            
        }
        }
    public Object [] obtener(){
        return libro.toArray();
        
    }
    public Libro buscar(int pos){
        Object []object=libro.toArray();
        Libro a=(Libro)object[pos];
        return a;
    }

}
