/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import excepciones.AlumnoNoEncontrado;
import java.util.ArrayList;
import model.Alumno;
/**
 *
 * @author pc
 */
public class tpcontrolador {
    private ArrayList<Alumno> db;
    
    public tpcontrolador(){
        File file new
    }
    
    public tpcontrolador(){
        db= new ArrayList();
    }
    
    public void nuevoAlumno(Alumno alum){
        getDb().add(alum);
    }

    /**
     * @return the db
     */
    public ArrayList<Alumno> getDb() {
        return db;
    }

    /**
     * @param db the db to set
     */
    public void setDb(ArrayList<Alumno> db) {
        this.db = db;
    }
    
    public Alumno buscar (String matricula) throws AlumnoNoEncontrado{
        for(Alumno alumn : db){
            if(alumn.getMatricula().compareTo(matricula)==0){
                return alumn;
            }
        } throw new AlumnoNoEncontrado();
    }
    
    public void guardar{
    try{
        
    }
}
}
