
package Modelo.BD;

import Excepciones.AcontecimientoNoEncontrado;
import Modelo.UML.Empresa;
import Modelo.UML.Persona;
import com.db4o.ObjectSet;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class EmpresaBD {
    

    
    private static Empresa e;
    
 
   
         public static Empresa consultar(Empresa em) throws Exception{
             
         
        ObjectSet resultado = GenericoBD.getCon().queryByExample(em);
        if (resultado.hasNext())
        {
            e = (Empresa) resultado.next();
            JOptionPane.showMessageDialog(null,"EMPRESA ENCONTRADA");
            return e;
        }
        else{
            throw new AcontecimientoNoEncontrado();
              
        }
    }
}
        
    
        
       // GenericoBD.cerrarBD();
   //     return e;
//    }
//    
//    public static void alta(Empresa e) throws Exception{
//          try
//          { 
//            GenericoBD.abrirBD();
//            plantilla = "INSERT INTO empresas VALUES (?,?,?,?)";
//            sentenciaCon = GenericoBD.getCon().prepareStatement(plantilla);
//            sentenciaCon.setString(1,e.getNif());
//            sentenciaCon.setString(2,e.getNombre());
//            sentenciaCon.setString(3,e.getRazonSocial());
//            sentenciaCon.setInt(4,e.getCnae());
//            
//            sentenciaCon.executeUpdate();
//            
//            GenericoBD.cerrarBD();
//            
//          }
//          catch(MySQLIntegrityConstraintViolationException ex){
//             // La empresa existe, no es un problema
//             // El resto de las excepciones si las relanzo
//              GenericoBD.cerrarBD();
//          }
//    }
//    
//}
