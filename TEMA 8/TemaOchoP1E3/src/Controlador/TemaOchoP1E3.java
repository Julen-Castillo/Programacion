

package Controlador;

import Clases.Persona;
import Vista.Ventana1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.omg.CORBA.UnionMemberHelper;


public class TemaOchoP1E3 {

    private static Ventana1 v;
    
     private static ArrayList<Persona> listaPersonas;
    
    public static void main(String[] args) {
        
     listaPersonas = new ArrayList<Persona>();
        
        
    v = new Ventana1();
    v.setVisible(true);
   
    }
    
     public static void altaPersona(String dni, String nombre,String apellidos, String curso)
    {
        
            listaPersonas.add(new Persona(dni, nombre, apellidos,curso));
    }
     
     
     public static void buscarDni(String dni){
         
         for (int x = 0 ;x < listaPersonas.size();x++){
             
             if(listaPersonas.get(x).getDni().compareTo(dni)==0 ){
                 
            
                 v.mostrarDatos(listaPersonas.get(x).getNombre(),listaPersonas.get(x).getApellidos(),listaPersonas.get(x).getCurso());
                 
                 
              

            
                 
     
              
         
           
    
         
             }
         }
     
     }
}


     
