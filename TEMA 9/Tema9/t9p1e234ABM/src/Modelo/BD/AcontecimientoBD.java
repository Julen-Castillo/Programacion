
package Modelo.BD;


import Excepciones.AcontecimientoNoEncontrado;
import Modelo.UML.*;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class AcontecimientoBD{
    
    /* Clase que contiene los métodos necesarios para trabajar
       con la tabla acontecimientos */
       
    private  Acontecimiento acontecimiento;
     private Acontecimiento a;
    private  ObjectContainer oc;
    private ObjectSet result;
    private Acontecimiento buscado;
     
  
            public AcontecimientoBD(ObjectContainer oc){
             this.oc = oc;
            }
             
           
    
    public void insertar(Acontecimiento ac){
        
        
  
        oc.store(ac);
    }

    public AcontecimientoBD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Acontecimiento consultaTodos(Acontecimiento nombre){
       
       
        ObjectSet conjunto = oc.queryByExample(nombre);
        while(conjunto.hasNext())
        {
            buscado = (Acontecimiento) conjunto.next();
//            lista.add(ac);
        }
        oc.close();
       return buscado;
    }

    
    public void borrar(Acontecimiento ac){
        
        
        ObjectSet result=oc.queryByExample (ac);

        Acontecimiento found =(Acontecimiento)result.next ();

        oc.delete(found);
    
    
    }
}
