
package t4practica1e8;

import javax.swing.JOptionPane;


public class T4Practica1E8 {

 
    public static void main(String[] args) {
        
         int[][] arrayMatriz = new int[10][10];
         int[] arraySuma = new int [10];
         
         for (int x = 0; x < arrayMatriz.length; x++)
             for (int y = 0; y < arrayMatriz[x].length; y++)
                arrayMatriz[x][y] = 0;
         
         int continuar = 0;
         do {
         
          
           int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el Nº de fila")); // Pedimos fila
           
        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el Nº de columna")); // Pedimos columna
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero para esa posicion")); // Pedimos valor para hacer la suma
       
     
       
            
            arrayMatriz[fila-1][columna-1] = numero; // que en la posicion 0 del array se guarde el numero que hemos introducido
            
    
         
           
         continuar = JOptionPane.showConfirmDialog(null,"Quieres continuar?");
         
           for(int i = 0; i < arrayMatriz.length; i++){ 
            for(int x = 0; x < arrayMatriz[i].length; x++){
               arraySuma[i] += arrayMatriz[i][x];  
    
            
            }  } } while (continuar == 0 );
     
              
        JOptionPane.showMessageDialog(null, "Fila 1: " + arraySuma[0] 
                                        + "\nFila 2: " + arraySuma[1]
                                        + "\nFila 3: " + arraySuma[2]
                                        + "\nFila 4: " + arraySuma[3]
                                        + "\nFila 5: " + arraySuma[4]
                                        + "\nFila 6: " + arraySuma[5]
                                        + "\nFila 7: " + arraySuma[6]
                                        + "\nFila 8: " + arraySuma[7]
                                        + "\nFila 9: " + arraySuma[8]
                                        + "\nFila 10: " + arraySuma[9]);
        
    }
}
      
        
         
         
         
        
         
         
         

