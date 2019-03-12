
package Modelo;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;


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
       String plantilla = "INSERT INTO eventos (Id, Nombre, Localizacion,Fecha,Hora_inicio,Hora_fin,Limite_personas) values(?,?,?,?,?,?,?);";
       
       java.sql.PreparedStatement ps = con.prepareStatement(plantilla);
         ps.setInt(1,ev.getId());
         ps.setString(2,ev.getNombre());
         ps.setString(3,ev.getLocalizacion());
         ps.setDate(4,conversionDate(ev.getFecha()));
         ps.setTime(5, conversionHora(ev.getHoraInicio()));
         ps.setTime(6, conversionHora(ev.getHoraFin()));
         ps.setInt(7, ev.getLimitePersonas());
       
         
         int numeroFilasActualizadas = ps.executeUpdate();
          JOptionPane.showMessageDialog(null, numeroFilasActualizadas);
        
       } 
      
      catch (Exception e){
   
           JOptionPane.showMessageDialog(null, e.getClass());
    }
   
    }
        // si es una consulta usamos executeQuery, devuelve un ResultSet
        //si es cualquier otra sentencia usamos executeUpdate, devuelve un int dependiendo las filas que ha modificado
 
    
    
}
