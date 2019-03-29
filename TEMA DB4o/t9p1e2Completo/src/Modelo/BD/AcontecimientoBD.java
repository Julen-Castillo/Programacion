
package Modelo.BD;


import Excepciones.AcontecimientoNoEncontrado;
import Modelo.UML.*;
import com.db4o.ObjectSet;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public  class AcontecimientoBD{

       
    private static Acontecimiento acontecimiento;
     
    public static void alta(Acontecimiento ac) throws Exception
    {
         GenericoBD.getCon().store(ac);
    }
    
    public static String listado() throws Exception{
        // Método que genera un String con los datos de todos los acontemientos
        ObjectSet resultado = GenericoBD.getCon().queryByExample(new Acontecimiento());
            

        String mensaje="";
        while (resultado.hasNext())
        {
            
            acontecimiento = (Acontecimiento) resultado.next();
                
            mensaje += acontecimiento.toString()+"\n";
        }
        return mensaje;
    }
    
    
    public static void borrar(Acontecimiento ac) throws Exception
    {
        GenericoBD.getCon().delete(ac);
    }
    
    public static Acontecimiento consultar(Acontecimiento ac) throws Exception{
        ObjectSet resultado = GenericoBD.getCon().queryByExample(ac);
        if (resultado.hasNext())
        {
            acontecimiento = (Acontecimiento) resultado.next();
        }
        else
            throw new AcontecimientoNoEncontrado();
                
        return acontecimiento;
    }
    
    public static void modificar(Acontecimiento ac) throws Exception
    {
       GenericoBD.getCon().store(ac);
    }
}
    
     
     // Añadido para el ejercicio completo
//    public static ArrayList<Acontecimiento> consultarProximosLibres() throws Exception
//    { 
//            // opcion dos: Select más compleja
//        
//            /* arraylist que contendrá todos los objetos de tipo acontecimiento
//               cuya fecha sea superior a la de hoy  y queden plazas libres */
//            ArrayList<Acontecimiento> lista = new ArrayList();
//            
//            GenericoBD.abrirBD();
//            
//            plantilla = "select * from acontecimientos where fecha > ?";
//            sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
//            // Conversión a sql.Date de la fecha de hoy
//            sentenciaPre.setDate(1, conversionDate(LocalDate.now()));
//            resultado = sentenciaPre.executeQuery();
//            while (resultado.next())
//            {  
//                // ¿ Hay plazas libres? 
//                if (isAforo(resultado.getString("nombre")))
//                {
//                    crearObjeto();               
//                    // La lista de asistentes no me interesa -- Carga bajo demanda.
//                    lista.add(acontecimiento);
//                }
//            }
//            resultado.close();
//            GenericoBD.cerrarBD();
//            return lista;
//    }
//    
//    public static boolean isAforo(String nombre) throws Exception{
//        // Controlador de base de datos ??????
//        if (AsistentesBD.getNumeroAsistentes(nombre)< resultado.getInt("aforo"))
//            return true;
//        return false;
        
        // return AsistentesBD.getNumeroAsistentes(nombre)< resultado.getInt("aforo");
//    }

