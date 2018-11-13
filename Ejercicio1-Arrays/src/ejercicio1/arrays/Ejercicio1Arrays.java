
package ejercicio1.arrays;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio1Arrays {


    
        
    public static void main(String[] args) {
       
   
       
  
       double[] arrayNumeros  = new double[10];
       
      
       
       for (int x=0; x < arrayNumeros.length; x++)
       {
            arrayNumeros[x] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero "+ x));
       }
        
       
       
       for(double elemento: arrayNumeros) 
           {
               JOptionPane.showMessageDialog(null, elemento);

       }
           
            Arrays.sort(arrayNumeros);
            JOptionPane.showMessageDialog(null,"El numero maximo es " +arrayNumeros[arrayNumeros.length -1]+ " el numero minimo es " +arrayNumeros[0]);
           
       
        
       
       
     
       
 
         
     
              
              
              
              
          
}
}
    
        

