
package t4practica1e6;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class T4Practica1E6 {


    public static void main(String[] args) {
        
    
        int [] codigosA = new int[5];
        int [] faltasA = new int[5];
         
        int continuar = 0;
     
         
         do{
       
            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un codigo de alumno"));
            
            int faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número de faltas"));
          
                 
            if(!Arrays.toString(codigosA).contains(codigo)){
                codigosA[i] = Integer.parseInt(codigo);
                diasA[i] = dia;
                faltasA[i] = faltas;
            
           
            }
            
             continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir más datos?");}
           
        
         
            }   while(continuar == 0);
                  
           String valor = "";
        for(int c = 0; c < codigosA.length; c++){
            valor += "Alumno: " + codigosA[c] + "  Día: " + diasA[c] + "  Faltas: " + faltasA[c] +"\n";
        }
         
        }
}

         
        
        
