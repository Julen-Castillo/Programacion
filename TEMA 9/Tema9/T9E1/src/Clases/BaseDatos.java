
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class BaseDatos {
  private  Connection con;
   
    
    public Connection conectar(){
        
        
        
       
        
   try { 
        
       //tipo de base de datos
      Class.forName("com.mysql.jdbc.Driver");
// --------------------------------------------------      
      String login="root";
      String password = "usbw";
// -----------------------------------------------------
      // a que base de datos y como llegar
      String url = "jdbc:mysql://localhost:3307/"+"t9e1";
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
    
    public void cerrar() throws SQLException{
        con.close();
        
        
    }
}
