
package Modelo;



import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;

public class BaseDeDatos {
    
      private Connection con;
        private ArrayList<Evento> listaEventos;

    public BaseDeDatos() {
    }

    public BaseDeDatos(Connection con) {
        this.con = con;
    }
    
     public Connection conectar(){
        
        
        
       
        
   try { 
        
       //tipo de base de datos
      Class.forName("com.mysql.jdbc.Driver");
// --------------------------------------------------      
      String login="root";
      String password = "usbw";
// -----------------------------------------------------
      // a que base de datos y como llegar
      String url = "jdbc:mysql://localhost:3307/"+"ejercicio2";
 //----------------------------------------------------------------
      
  //    se define la conexion(me lo he inventado xD)
      con = DriverManager.getConnection(url,login,password);
 // -----------------------------------------------------------------------
      return con;
   }
   
   catch (Exception e){
       return null;
                      }
    }
    
    
    
    
}
