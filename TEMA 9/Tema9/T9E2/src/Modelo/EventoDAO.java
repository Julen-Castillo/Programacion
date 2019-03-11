
package Modelo;

import com.mysql.jdbc.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;


public class EventoDAO {
     private Connection con;
    private Evento event;

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
    
    
            
            
    
    public void darAlta(Evento ev) throws SQLException{
        

    
      try {
        
//Statement 
//        java.sql.Statement sentencia = con.createStatement();
//         String s="INSERT INTO persona VALUES(')" + p.getNombre() + p.getEdad() + p.getProfesion() + p.getTelefono();
      //    int resultado = sentencia.executeUpdate(s);
          
       //PreparedStatement
       //creamos plantillas
       String plantilla = "INSERT INTO eventos values(?,?,?,?,?,?);";
       
       java.sql.PreparedStatement ps = con.prepareStatement(plantilla);
         ps.setInt(1,event.getId());
         ps.setString(2,event.getNombre());
         ps.setString(3,event.getLocalizacion());
         ps.setDate(4,conversionDate(event.getFecha()));
         ps.setTime(5, conversionHora(event.getHoraInicio()));
         ps.setTime(6, conversionHora(event.getHoraFin()));
         ps.setInt(7, event.getLimitePersonas());
       
         
         int numeroFilasActualizadas = ps.executeUpdate();
        
       } 
      
      catch (Exception e){
   
    
    }
   
    }
        // si es una consulta usamos executeQuery, devuelve un ResultSet
        //si es cualquier otra sentencia usamos executeUpdate, devuelve un int dependiendo las filas que ha modificado
 
    
    
}
