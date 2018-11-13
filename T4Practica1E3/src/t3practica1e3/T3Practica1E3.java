
package t3practica1e3;

import javax.swing.JOptionPane;


public class T3Practica1E3 {

 
    
  
        
        
       /*  int[] diasArray = new int[31]; 
       String [] arrayMeses = {"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        
        
       for(int x=0; x < 12; x++) 
           {
               for (int i=0; i < diasArray.length; i++){
             int litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce los litros de agua del dia " +diasArray[i] + " en "+ arrayMeses[x]));
             
             double litrosMes = 0;
             
             litrosMes = litrosMes + litros;
             
             
             

               
             
             JOptionPane.showMessageDialog(null, "han caido "+litrosMes + " Litros de agua en el dia "+diasArray[i]+ " del mes "+ arrayMeses[x] );
             
             double litrosFinal = 0;
             
             litrosFinal = litrosFinal + litrosMes;
             
             
             
             
             int continuar = JOptionPane.showConfirmDialog(null,"Quieres continuar)");
 
               } 
    }
    
}
}

*/
    
    public static int dia;
    public static int mes;
    public static double litros;
    public static int continuar;

    
      public static void main(String[] args) {
          
 
          
          tratarDatos();
          
          
          
          
      }
      
      public static void tratarDatos(){
          
          int[][] diasArray = new int[31][12]; 
       

          
          
          do {
              for ( int x=0; x < diasArray.length; x++)
              
              
              dia = Integer.parseInt(JOptionPane.showInputDialog("Los litros caidos en el dia "+ diasArray[x][0]));
           
              
              for (int i =0; i < 12; i++)
              
              mes = Integer.parseInt( JOptionPane.showInputDialog("Introduce el mes"));
               
              // mes 
              //litros
         
               
               
              
              
          String continuar = JOptionPane.showInputDialog("Quieres continuar? \n" + "1.SI\n"+ "2.NO");
              
          } while (continuar != 2);
              
          }
          
          
      }
      
      