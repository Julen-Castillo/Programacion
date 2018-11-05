
package practicatres4;

import javax.swing.JOptionPane;

public class PracticaTres4 {

      public static String nombreAlumno;
      public static String nombreAsignatura;
   
    public static void main(String[] args) {
        
      String nombreAlumno;
      String Matematicas,Ciencias,Historia,Geografia,Lengua,Ingles;
      
      
        do {        
            
            try 
            {
                
                 nombreAlumno = JOptionPane.showInputDialog("Teclear el nombre del alumno: ");
                 Matematicas = solicitarNota("matematicas");
                 Ciencias = solicitarNota("ciencias");
                 Historia = solicitarNota("historia");
                 Geografia = solicitarNota("geografia");
                 Lengua = solicitarNota("lengua");
                 Ingles = solicitarNota("ingles");
                 
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas");
            }
                
     

     
  
   
    public static int solicitarNota(String nombreAsignatura){ 
        int nota;
     
       int contador = 0;
       int suma = 0;
      
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la calificacion de" + nombreAsignatura + nombreAlumno));
            contador = contador++;
            suma = suma + nota;
          
            
            
    
    }
}
