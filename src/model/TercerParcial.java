/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controller.tpcontrolador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TercerParcial {
    
    public static boolean modificar(String matric, tpcontrolador controller){
        
    }
    
    //public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
   /* Alumno alumn= new Alumno("01444","i dunno",new Fecha(8,3,1997));
    
    File file=new File("C:\\Users\\pc\\Documents\\NetBeansProjects\\practica_01\\Biblioteca\\alumnos.dat");
    
    FileOutputStream output= new FileOutputStream(file);
    
    
    ObjectOutputStream writer= new ObjectOutputStream(output);
    
    writer.writeObject(alumn);
    
    writer.close();
    output.close();*/
    
 /*   ArrayList<Alumno> alumnitos=new ArrayList();
    alumnitos.add(new Alumno("0144","jrfu",new Fecha(8,3,1997)));
     File file=new File("C:\\Users\\pc\\Documents\\NetBeansProjects\\practica_01\\Biblioteca\\alumnos.dat");
    
    FileOutputStream output= new FileOutputStream(file);
    
    
    ObjectOutputStream writer= new ObjectOutputStream(output);
    
    writer.writeObject(alumnitos);
    
    writer.close();
    output.close();
    /*
    
            
            
            
    /*File file =new File("alumnos.dat");
    FileInputStream input= new FileInputStream(file);
    ObjectInputStream reader= new ObjectInputStream(input);
    
    Alumno alumnito= (Alumno)reader.readObject();
        System.out.println(alumnito.getNombre());
    
        reader.close();
        input.close();*/
  /*  File file =new File("alumnos.dat");
    FileInputStream input= new FileInputStream(file);
    ObjectInputStream reader= new ObjectInputStream(input);
    
    ArrayList<Alumno> coleccion= (ArrayList<Alumno>)reader.readObject();
        
        for (int i = 0; i < coleccion.size(); i++) {
            Alumno a=coleccion.get(i);
            System.out.println(a.getNombre());
        }
    
        reader.close();
        input.close();
    
}*/
    public static void main(String[] args) {
      
        tpcontrolador megan= new tpcontrolador();
        
        Scanner teclado= new Scanner(System.in);
      int opcion=0;
        do{
            System.out.println("1.Nuevo Alumno");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.Listado");
            System.out.println("5.Salir");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Nuevo Alumno");
                    System.out.println("Matricula");
                    String matricula=teclado.nextLine();
                    System.out.println("Nombre");
                    String nombre= teclado.nextLine();
                    System.out.println("Fecha de nacimiento");
                    Fecha nacimiento= new Fecha(teclado.nextInt(),teclado.nextInt(),teclado.nextInt());
                    Alumno nuevo= new Alumno(matricula,nombre,nacimiento);
                   break;
                case 2:
                    System.out.println("Modificar Alumno");
                    System.out.println("Matricula");
                    String noControl=teclado.next();
                    try{
                         Alumno alumnoModificar= megan.buscar();
                         System.out.println("");
                    }
                    catch{
                        
                    }
                   
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4.Listado");
                    for(Alumno a : megan.getDb()){
                        System.out.println(a);
                    }
                    
                    break;
                case 5:
                    System.out.println("Guardar");
                    megan.guardar();
                    break;
                case 6:
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("Opcion inexistente");
                    break;
            }
            
        }while(opcion!=5);
        
    }
}
