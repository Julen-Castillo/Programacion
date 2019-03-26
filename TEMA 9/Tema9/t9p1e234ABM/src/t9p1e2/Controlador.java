package t9p1e2;

import Modelo.UML.Acontecimiento;
import GUI.*;
import Modelo.BD.*;
import Modelo.UML.Empresa;
import Modelo.UML.Persona;
import com.db4o.ObjectContainer;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;



public class Controlador {
   
    private static Acontecimiento acontecimiento;
    private static Persona persona;
    private static Empresa e;
    private static AcontecimientoBD abd;
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    private static Persona pbd;
    private static GenericoBD gb;
    private static ObjectContainer oc;
    private static Acontecimiento acontecimientoEncontrado;
    
    
    
    public static void main(String[] args) throws Exception {   
        gb = new GenericoBD();
        abd = new AcontecimientoBD(gb.getConexion());
        vp = new VentanaPrincipal();
        vp.setVisible(true);

    }
    
    public static void visualizarVentanaAlta(){
        // Dejo por debajo la principal
         ve = new VentanaAcontecimientos();
         ve.setVisible(true);
    }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
       
    public static void grabarAcontecimiento(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, int nro)throws Exception{
       
        // Alta -- Crear objeto y enviarlo a AcontecimientoBD
        
        acontecimiento = new Acontecimiento(nombre,lugar, fecha,horaI,horaF,nro);
        abd.insertar(acontecimiento);
 
    }
    
    public static void eliminarDatos(String nombre){
        
        acontecimiento = new Acontecimiento(nombre);
        abd.borrar(acontecimiento);
        
    }
    
    public static void Consultar (String nombre){
        
        acontecimiento = new Acontecimiento(nombre);
        
       
        
        acontecimientoEncontrado = new Acontecimiento();
        acontecimientoEncontrado =  abd.consultaTodos(acontecimiento);
      
             ve.mostrarDatos(acontecimientoEncontrado);
    }
  
     
   public static void terminar(){
       System.exit(0);
   }
   
//   public static String listado() throws Exception{
//       return AcontecimientoBD.listado();
//   }
   
//   public static void borrarAcontecimiento(String nombre) throws Exception
//   {
//       // Primero lo consultamos, mostramos sus datos y luego pedimos confirmación.
//       acontecimiento = new Acontecimiento(nombre);
//       acontecimiento = AcontecimientoBD.consultar(acontecimiento);
//       if (vp.mostrar(acontecimiento.toString()) == true)
//            AcontecimientoBD.borrar(acontecimiento);
//   }
    
    public static void modificarAcontecimientoParteUno(String nombre) throws Exception
   {
       // Primero consultamos y mostramos sus datos
//       acontecimiento = AcontecimientoBD.consultar(new Acontecimiento(nombre));
       ve = new VentanaAcontecimientos(acontecimiento);
       ve.setVisible(true);
   }
    
   public static void modificarAcontecimientoParteDos(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, int nro) throws Exception
   {
       // actualizamos objeto en memoria
       acontecimiento.setLugar(lugar);
       acontecimiento.setFecha(fecha);
       acontecimiento.setHoraI(horaI);
       acontecimiento.setHoraF(horaF);
       acontecimiento.setAforo(nro);
//       AcontecimientoBD.modificar(acontecimiento);
   }
   
//   public static void darAlta(String dni, String nombre, String telefono, String empresa, String nombreEmpresa, String direccion, String telefonoEmpresa) throws Exception {
//   
//      e = new Empresa();
//      e.setNombre(empresa);
//      e.setDireccion(direccion);
//      e.setTelefono(telefonoEmpresa);
//      
//         EmpresaBD.alta(e);
//       
//        persona = new Persona(dni,nombre,telefono, e);
//        PersonaBD.alta(persona);
       
   }
//   
//   public static boolean buscarDatos (String nombre){
//       
//        pbd = new Persona();
//       
//       pbd = PersonaBD.consultar(nombre);
//           
//           return false;
//}
//}
