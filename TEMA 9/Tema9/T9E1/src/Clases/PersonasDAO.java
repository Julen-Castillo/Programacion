
package Clases;

import java.sql.*;

// si da error con el con lo que hay que hacer es  "oPersonaDAO = new PersonasDAO(con);" pasarle el con en el constructor de PersonasDAO previamente creando el atributo Connection con y añadiendole un constructor
public class PersonasDAO {
    
    private Connection con;
    private Persona persona;
    
    public PersonasDAO() {
    }

    
    public PersonasDAO(Connection con) {
        this.con = con;
    }
    
    public void  insertarPersona(Persona p){
  
        //3 formas de insertar datos en sql, Statement, PreparedStatement y CallableStatement
        //sin parametros: Statement y si hay parametros se puede con Statement y con PreparedStatement     
       try {
        
//Statement 
        Statement sentencia = con.createStatement();
//         String s="INSERT INTO persona VALUES(')" + p.getNombre() + p.getEdad() + p.getProfesion() + p.getTelefono();
      //    int resultado = sentencia.executeUpdate(s);
          
       //PreparedStatement
       //creamos plantillas
       String plantilla = "INSERT INTO persona values(?,?,?,?);";
       
       PreparedStatement ps = con.prepareStatement(plantilla);
         ps.setString(1,p.getNombre());
         ps.setInt(2,p.getEdad());
         ps.setString(3,p.getProfesion());
         ps.setInt(4,p.getTelefono());
        int resultado2 = ps.executeUpdate();
        
       }
        // si es una consulta usamos executeQuery, devuelve un ResultSet
        //si es cualquier otra sentencia usamos executeUpdate, devuelve un int dependiendo las filas que ha modificado
  catch (Exception e){
    
    }
    
    
    }
    
    public Persona consultar(String nombre ){
        
        try {
        
         String plantilla = "SELECT * FROM persona where nombre = ?;";
       
       PreparedStatement ps = con.prepareStatement(plantilla);
       ps.setString(1, nombre);
       ResultSet resultado = ps.executeQuery();
   
       
       if (resultado.next()){
           //hay datos
           persona = new Persona();
           persona.setNombre(resultado.getString("nombre"));
           persona.setEdad(resultado.getInt("edad"));
           persona.setProfesion(resultado.getString("profesion"));
           persona.setTelefono(resultado.getInt("telefono"));
           
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
