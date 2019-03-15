
package Modelo.BD;

import Modelo.UML.Empresa;
import Modelo.UML.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmpresaBD {
    
    private Empresa e;
   private static PreparedStatement sentenciaPre;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
    
     public static void alta(Empresa em) throws Exception
    {

        GenericoBD.abrirBD();
            
        // Preparar la sentencia que se quiere ejecutar
            plantilla = "INSERT INTO empresas (nombre,telefono,direccion)VALUES (?,?,?)";
            sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
            sentenciaPre.setString(1,em.getNombre());
            sentenciaPre.setString(2,em.getDireccion());
            sentenciaPre.setString(3,em.getTelefono());
           
            
      
            
            // Ejecutar sentencia
            int n = sentenciaPre.executeUpdate();
            System.out.println( n + "filas insertadas");
      
            // Cerrar la conexión
            GenericoBD.cerrarBD();
}
    
}
