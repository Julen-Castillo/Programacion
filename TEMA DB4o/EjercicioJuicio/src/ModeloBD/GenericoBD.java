/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 1gdaw03
 */
public class GenericoBD {
      private static Connection con;
        
    public static void abrirBD() throws Exception
    { 
        // setCon también es un buen nombre para este método
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3307/"+"ejercicioabogados";
        con = DriverManager.getConnection(url,"root","usbw");
    }
    
    public static void cerrarBD() throws Exception
    {    
        con.close();
    }

    public static Connection getCon() 
    {
        return con;
    }

    
}
