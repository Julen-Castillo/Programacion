
package t5practicaunoe2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class T5PracticaUnoE2 {

    public static void main(String[] args) {
        
     /*   ArrayList<ArrayList<Double>>Alumnos = new ArrayList();
          ArrayList<ArrayList<String>>Idiomas = new ArrayList();
          ArrayList<String>Nivel = new ArrayList();
        
   
       Idiomas.add(new ArrayList());
       Idiomas.get(0).add(JOptionPane.showInputDialog("Escribe el idioma"));
       
       Nivel.add(JOptionPane.showInputDialog("Introduceme el Nivel"));
       
       Alumnos.add(new ArrayList());
       Alumnos.get(0).add(Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de alumnos")));
       
       */
    ArrayList<Integer>Alumnos =new ArrayList();
    ArrayList<ArrayList<String>>Informacion = new ArrayList();
    
    
    Informacion.add(new ArrayList());
    Informacion.get(0).add(JOptionPane.showInputDialog("Escribe el idioma"));
    Informacion.add(new ArrayList());
    Informacion.get(1).add(JOptionPane.showInputDialog("Escribe el nivel"));
    
    
    Alumnos.add(Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de alumnos")));
    
    
    
    
    

            
            
 
    
    
 
    
    
    
    
    
      
       
       
        
        
       
        
      
    }
    
}
