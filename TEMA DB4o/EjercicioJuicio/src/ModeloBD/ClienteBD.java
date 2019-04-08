
package ModeloBD;

import Modelo.Cliente;
import Modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ClienteBD {
    private static PreparedStatement sentenciaPre;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
    
    public static void alta(Cliente cl) throws Exception{
        
        GenericoBD.abrirBD();
        
             plantilla = "INSERT INTO cliente (dni, nombre, apellidos,direccion,telefono) VALUES (?,?,?,?,?)";
            sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
            sentenciaPre.setString(1,cl.getDNI());
            sentenciaPre.setString(2,cl.getNombre());
         //   sentenciaPre.setDate(3,conversionDate(ac.getFecha()));
         // sentenciaPre.setTime(4,conversionTime(ac.getHoraI()));
            sentenciaPre.setString(3,cl.getApellidos());
            sentenciaPre.setString(4, cl.getDireccion());
            sentenciaPre.setInt(5, cl.getTelefono());
            //sentenciaPre.setInt(5,c.getTelefono());
            
            // Ejecutar sentencia
            int n = sentenciaPre.executeUpdate();
            System.out.println( n + "filas insertadas");
      
            // Cerrar la conexión
          GenericoBD.cerrarBD();
        
  
    }
    
    public static Cliente baja(Cliente cl) throws SQLException, Exception {
        
          GenericoBD.abrirBD();
        
         plantilla = "select * from personas where dni = ?";
        sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,cl.getDNI());
        resultado = sentenciaPre.executeQuery();
        if (resultado.next()){
            if (resultado.next())
            {
                // Completo el objeto recibido.
                // También se puede crear uno nuevo
               cl.setNombre(resultado.getString("nombre"));
               cl.setApellidos(resultado.getString("apellidos"));
               cl.setDireccion(resultado.getString("telefono"));
               // Relación Persona Empresa
               cl.setTelefono(resultado.getInt("telefono"));
               // La lista de sus eventos no me interesa siempre
            }
            else
                cl =  null;
            
            
          
        }
          resultado.close();
             GenericoBD.cerrarBD();
             return cl;
        
        
    }
}
    
    
  
