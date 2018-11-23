
package t4practica1e7;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class T4Practica1E7 {

  
   
    public static void main(String[] args) {
        
         int[] productos = {10,23,30,47,55,65,135,256,526,663};
         
         int contadorProducto []= new int[10];
         
         
         inicializarContador(contadorProducto);
         
         entradaDatos(productos, contadorProducto);
         
         salidaDatos(productos, contadorProducto);
    }
    
   private static void inicializarContador(int []contadorProducto){
       
        for (int x = 0; x < contadorProducto.length; x++)
           contadorProducto[x] = 0;
    
}
   
   private static void entradaDatos(int[] productos, int[] contadorProducto){
       
       
  int continuar = 0;
        
        do{
            int CodProd = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el codigo del producto \n" +
                                                                                "1 = 10\n" +  
                                                                                "2 = 23\n" +
                                                                                "3 = 30\n" +
                                                                                "4 = 47\n" +
                                                                                "5 = 55\n" +
                                                                                "6 = 65\n" +
                                                                                "7 = 135\n" +
                                                                                "8 = 256\n" +
                                                                                "9 = 526\n" +
                                                                                "10 = 663\n" ));
              
           int incorrecto; 
     incorrecto =  Arrays.binarySearch(productos, CodProd);
     
     if (incorrecto < 0 || incorrecto >9){
              
      JOptionPane.showMessageDialog(null, "numero incorrecto");
      }
      

        
           
            
//  if( productos[] =   productos.indexOf(CodProd));
               
            

     else {


//indicar en caso de que el codigo no exista
            
            int NumProd = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el nº de productos vendidos"));

            int position = Arrays.binarySearch(productos, CodProd);
            contadorProducto[position] = contadorProducto[position] + NumProd;
            
            
            continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir más datos?");
     }
     
        }while(continuar == 0);
        
        
           
        
   
    
}
   
    private static void salidaDatos (int[]productos, int[]contadorProducto){
        
        
        
         String valor = "";
        for(int c = 0; c < contadorProducto.length; c++){
            valor += "El producto Nº: " + productos[c] + "  Cantidad: " + contadorProducto[c] + "\n";
        }
        
        
        
        
        
        
        JOptionPane.showMessageDialog(null, "La frecuencia de las letras es: \n\n" + valor);
        
    }
}