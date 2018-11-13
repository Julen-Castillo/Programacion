
package t4practica1e1;

import javax.swing.JOptionPane;


public class T4Practica1E1 {

  
    public static void main(String[] args) {
        
        String [] arrayMeses = {"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        for (int x=0; x < 12; x++)
        {

       String mes = JOptionPane.showInputDialog("Introduce los meses en orden");
       
       
       if (mes.equalsIgnoreCase(arrayMeses[x])){
           
           JOptionPane.showMessageDialog(null,"Has escrito el mes correctamente");
       
        }else {
            JOptionPane.showMessageDialog(null, "El mes introducido no corresponde con el orden existente ");
     
               
       }
      
        }

    
  
    }
}
