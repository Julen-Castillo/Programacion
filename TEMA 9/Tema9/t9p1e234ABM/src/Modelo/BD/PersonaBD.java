/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

   

import static Modelo.BD.AcontecimientoBD.conversionDate;
import static Modelo.BD.AcontecimientoBD.conversionTime;
import Modelo.UML.Acontecimiento;
import Modelo.UML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonaBD {
    
    private static Persona persona;
    private static PreparedStatement sentenciaPr;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
    private static Connection con;
    


 public static void alta(Persona pe) throws Exception
    {

        GenericoBD.abrirBD();
            
        // Preparar la sentencia que se quiere ejecutar
            plantilla = "INSERT INTO personas (dni, nombre,telefono,empresa) VALUES (?,?,?,?)";
            sentenciaPr = GenericoBD.getCon().prepareStatement(plantilla);
            sentenciaPr.setString(1,pe.getDni());
            sentenciaPr.setString(2,pe.getNombre());
            sentenciaPr.setString(3,pe.getTelefono());
            sentenciaPr.setString(4, pe.getEmpresa().getNombre());
            
      
            
            // Ejecutar sentencia
            int n = sentenciaPr.executeUpdate();
            System.out.println( n + "filas insertadas");
      
            // Cerrar la conexión
            GenericoBD.cerrarBD();
}
 
   public static Persona consultar(String nombre ){
        
        try {
        
         String plantilla = "SELECT * FROM persona where nombre = ?;";
       
       PreparedStatement ps = con.prepareStatement(plantilla);
       ps.setString(1, nombre);
       ResultSet resultado = ps.executeQuery();
   
       
       if (resultado.next()){
           //hay datos
           persona = new Persona();
           persona.setDni(resultado.getString("dni"));
           persona.setNombre(resultado.getString("nombre"));
           persona.setTelefono(resultado.getString("telefono"));
           persona.getEmpresa().setNombre(resultado.getString("empresa"));
          
        
           
           return persona; 

//resultado.getString("nombre") + " " + resultado.getInt("edad") + " " + resultado.getString("profesion") + " " + resultado.getInt("telefono");
       }
       else {
                //cero filas seleccionadas
                   return null;
               }
        }
        
        catch (Exception e){
        
         return null;
        }
        
        
    }
 
}