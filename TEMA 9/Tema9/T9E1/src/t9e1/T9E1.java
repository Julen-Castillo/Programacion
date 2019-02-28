
package t9e1;

import Clases.BaseDatos;
import Clases.Persona;
import Clases.PersonasDAO;
import Vista.VentanaAlta;
import Vista.VentanaPrincipal;
import java.sql.Connection;
import java.sql.SQLException;


public class T9E1 {

private static Connection con;
private static VentanaPrincipal v;
private static PersonasDAO oPersonaDAO;
private static VentanaAlta v2;
private static BaseDatos bd;


    public static void main(String[] args) {
        
        //Opcion 1
        //crear el objeto base de datos y mandar a la funcion conectar
         bd = new BaseDatos();
       con = bd.conectar();
          
       if (con == null){
           
           System.out.println("Problemas con la base de datos");
           System.exit(-1);
       }
       
       oPersonaDAO = new PersonasDAO(con);
     
       v = new VentanaPrincipal();
       v.setVisible(true);
       //Opcion dos, si vemos el objeto BaseDatos nos quedamos con la opcion 1
       //si no usamos esta opcion numero 2
       
       // poner la clase conectar en statico
        
       /*con = BaseDatos.conectar();
       
       
       if (con == null){
           
           System.out.println("Problemas con la base de datos");
           
           System.exit(-1);
       */
    }
    
    public static void darAlta(String nombre,Integer edad, String profesion, Integer telefono){
        
        Persona p = new Persona(nombre,edad,profesion,telefono);
        
        //insertar en la base de datos (en la tabla personas)
        
        oPersonaDAO.insertarPersona(p);
        
    }
    
    public static void crearVentana2(String operacion){
        String operacionActivita = operacion;
       v2 = new VentanaAlta(operacionActivita);
       v2.setVisible(true);
       v.setVisible(false);
    
}
    public static String consultar(String nombre){
      
        return oPersonaDAO.consultar(nombre);
        
    }

    public static void Salir() throws SQLException {
        
        bd.cerrar();
        System.exit(0);
    }
}