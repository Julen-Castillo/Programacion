
package Controladora;

import Excepciones.CampoIncorrecto;
import Excepciones.CampoVacio;
import Modelo.BaseDeDatos;
import Modelo.Evento;
import Modelo.EventoDAO;
import Vista.VentanaAltaEventos;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.print.attribute.standard.DateTimeAtCompleted;

public class T9E2 {
 
    
    private static VentanaAltaEventos v1;
    private static BaseDeDatos bd;
    private static Connection con;
    private static LocalDate fecha;
    private static Evento e;
    private static EventoDAO oEventoDAO;
    public static void main(String[] args) {
    
        bd = new BaseDeDatos();
         con = bd.conectar();
          
       if (con == null){
           
           System.out.println("Problemas con la base de datos");
           System.exit(-1);
       }
       
        
     crearVentana();
        
        
        
    }
    
    
      public static void crearVentana(){
          
          v1 = new VentanaAltaEventos();
          v1.setVisible(true);
          
          
      }
      
      public static void validarId(String id)throws Exception{
          
           if(id.isEmpty()){
                   throw new CampoVacio();
               }
               
           else {
           Pattern p = Pattern.compile("^[0-9]{1,3}$");
           Matcher m = p.matcher(id);

           if(m.matches()==false){
         throw new CampoIncorrecto();
           }
           }

      }
      public static void validarNombre(String nombre)throws Exception{
          
          
          if(nombre.isEmpty()){
               throw new CampoVacio();
          }
          
        else {
           Pattern p = Pattern.compile("^[A-Z][a-z]{1,20}$");
           Matcher m = p.matcher(nombre);

           if(m.matches()==false){
         throw new CampoIncorrecto();
           }
           }
      }
      
      
      public static void validarLocalizacion(String localizacion) throws Exception {
          
          if(localizacion.isEmpty()){
              throw new CampoVacio();
          }
          
          else {
           Pattern p = Pattern.compile("^[A-Z][a-z]{1,30}$");
           Matcher m = p.matcher(localizacion);
              
           if (m.matches()==false){
               
               throw new CampoIncorrecto();
           }
          
              
          }
          
      }
      
      
      public static void validarFecha(LocalDate fechaEvento)throws Exception{
       
        
  
         
      
         
     }
     
          
//     else { 
////           Pattern p = Pattern.compile("^\\d{1 ,2}/\\d{1 ,2}/\\d{2}$");
////           Matcher m = p.matcher(fechaEvento);
////           if(m.matches()){
////           
////          DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/mm/yy");
////          LocalDate fecha = LocalDate.parse(fechaEvento,f);
////           }
////           
////           else {
////               
////               throw new CampoIncorrecto();
////               
////           }
////     }
//           
//          
//      }
   

      public static void validarLimite(Integer limite) throws Exception{
          
          if (limite < 10){
              throw new CampoIncorrecto();
     
          }
          
      }
      
      public static void añadirEvento(Integer id, String nombre, String lugar, LocalDate Fecha, LocalTime HoraInicio, LocalTime HoraFin, Integer LimitePersonas) throws SQLException{
          
          
           e = new Evento(id,nombre,lugar,fecha,HoraInicio,HoraFin,LimitePersonas);
           
           
           
           oEventoDAO.darAlta(e);
          
//          DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/YYYY");
//          LocalDate fechaEvento = LocalDate.parse(Fecha, f);
//          
          
   
          
          
          
                  }
}
      //}
//} 
