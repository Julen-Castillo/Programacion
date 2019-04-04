
package ModeloBD;

import Modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class ClienteBD {
    private static PreparedStatement sentenciaPre;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
    
    public static void alta(Persona c) throws Exception{
        
        GenericoBD.abrirBD();
        
             plantilla = "INSERT INTO cliente (dni, nombre, apellidos,direccion) VALUES (?,?,?,?)";
            sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
            sentenciaPre.setString(1,c.getDNI());
            sentenciaPre.setString(2,c.getNombre());
         //   sentenciaPre.setDate(3,conversionDate(ac.getFecha()));
         // sentenciaPre.setTime(4,conversionTime(ac.getHoraI()));
            sentenciaPre.setString(3,c.getApellidos());
            sentenciaPre.setString(4, c.getDireccion());
            //sentenciaPre.setInt(5,c.getTelefono());
            
            // Ejecutar sentencia
            int n = sentenciaPre.executeUpdate();
            System.out.println( n + "filas insertadas");
      
            // Cerrar la conexión
          GenericoBD.cerrarBD();
        
  
    }
    
    
    
}
