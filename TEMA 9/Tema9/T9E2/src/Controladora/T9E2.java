
package Controladora;

import Modelo.BaseDeDatos;
import Vista.VentanaAltaEventos;
import java.sql.*;

public class T9E2 {
 
    
    private static VentanaAltaEventos v1;
    private static BaseDeDatos bd;
    private static Connection con;

    public static void main(String[] args) {
    
        bd = new BaseDeDatos();
         con = bd.conectar();
          
       if (con == null){
           
           System.out.println("Problemas con la base de datos");
           System.exit(-1);
       }
       
        
     crearVentana();
        
        
        
    }
    
      public static void crearVentana(){
          
          v1 = new VentanaAltaEventos();
          v1.setVisible(true);
          
          
      }
    
}
