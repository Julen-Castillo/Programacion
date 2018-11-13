/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatres1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class PracticaTres1 {  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String Horas = JOptionPane.showInputDialog("Teclea el numero de horas trabajadas");
         int horas = Integer.parseInt(Horas);
       
         int SueldoSemanal = 0;
       
        
        char Estudios = JOptionPane.showInputDialog("Teclea tus estudios: r P de primario, M de medo y S de superior").charAt(0);
        
        
            if (horas >= 40){ 
            SueldoSemanal = horas * 15;
              
        JOptionPane.showMessageDialog(null, "Tu sueldo es de " +SueldoSemanal);
       
            }else {  
               
            JOptionPane.showMessageDialog(null, "Tu sueldo es de " +horas * 10);
           
           }
            
          
            
               
            do
            {  char EstadoCivil = JOptionPane.showInputDialog("Teclea tu Estado Civil: S de soltero, C de casado, V de viudo y D de divorciado ").charAt(0); 
          
                   EstadoCivil = Character.toUpperCase(EstadoCivil);
            }
                while (EstadoCivil != 'C' && EstadoCivil !='V' && EstadoCivil!= 'S' && EstadoCivil != 'D');
            
            
           
            }
                
                
                
            
            
         
            
      
        }
           
    
}


        
      
        
        
            
        
                
             
       
  
    

