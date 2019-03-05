
package Modelo;

import com.mysql.jdbc.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;


public class EventoDAO {
     private Connection con;
    private Evento e;

    public EventoDAO() {
    }

    public EventoDAO(Connection con) {
        this.con = con;
    }
    
    public static java.sql.Date conversionDate(LocalDate fecha){
        
        return java.sql.Date.valueOf(fecha);
    }
    
    public static java.sql.Time conversionHora(LocalTime hora){
        
        return java.sql.Time.valueOf(hora);
        
    }
    
    
            
            
    
    public void darAlta() throws SQLException{
        

    
      try {
        
//Statement 
//        java.sql.Statement sentencia = con.createStatement();
//         String s="INSERT INTO persona VALUES(')" + p.getNombre() + p.getEdad() + p.getProfesion() + p.getTelefono();
      //    int resultado = sentencia.executeUpdate(s);
          
       //PreparedStatement
       //creamos plantillas
       String plantilla = "INSERT INTO persona values(?,?,?,?,?,?);";
       
       java.sql.PreparedStatement ps = con.prepareStatement(plantilla);
         ps.setInt(1,e.getId());
         ps.setString(2,e.getNombre());
         ps.setString(3,e.getLocalizacion());
         ps.setDate(4,conversionDate(e.getFecha()));
         ps.setTime(5, conversionHora(e.getHoraInicio()));
         ps.setTime(6, conversionHora(e.getHoraFin()));
         ps.setInt(7, e.getLimitePersonas());
       
         
         int numeroFilasActualizadas= ps.executeUpdate();
        
       } 
      
      catch (Exception e){
   
    
    }
   
    }
        // si es una consulta usamos executeQuery, devuelve un ResultSet
        //si es cualquier otra sentencia usamos executeUpdate, devuelve un int dependiendo las filas que ha modificado
 
    
    
}
