
package ejerciciozoo;

import Clase.Socio;
import Clase.SocioFamiliar;
import Clase.SocioIndividual;
import Vista.Ventana1;
import com.sun.corba.se.impl.ior.TaggedProfileFactoryFinderImpl;
import java.util.ArrayList;


public class EjercicioZoo {

       private static ArrayList<SocioIndividual> lSocioInvidivual;
       private static ArrayList<SocioFamiliar>lSocioFamiliar;
             
         
      
      public static Ventana1 ventanaSocio;
             
    public static void main(String[] args) {
        
       ventanaSocio = new Ventana1();
        ventanaSocio.setVisible(true);
        
        
    
 
    }
    
    public static void altaFamiliar(String nombre, String apellido,String telefono, String correo){
    
        
       
        lSocioFamiliar.add(new SocioFamiliar(nombre, apellido, telefono, correo));
        
        
        
        
    }
    
    public static void altaIndividual (String nombre, String apellido,String telefono, String correo){
    
         
        
        
    }
}