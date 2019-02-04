
package practicacuatro;

import Clases.Contrato;
import Clases.Departamento;
import Clases.Empleados;
import Clases.Personal;
import Vista.InicioSesion;
import Vista.VentanaAlta;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PracticaCuatro {

    private static Departamento aDepartamento[];
    private static Contrato aContrato[];
    private static Personal administrador;

    public PracticaCuatro() {
    }
    
    
    private static ArrayList<Empleados> aEmpleado;
    
    private static Empleados oEmpleado;
    
      //Alta o modificacion
    
    private static String operacion;
    
    
    /* Contador fallos */
    
    private static int cErrores = 0;
    
    private static InicioSesion v;
     private static VentanaAlta vAlta;
  
   
    public static void main(String[] args) {
        
        generarDatos();  
        
          v = new InicioSesion();
           v.setVisible(true);
           
           
    }
    
    public static void Salir(){
          JOptionPane.showMessageDialog(null, "Adios, vaquer@");
          System.exit(0);
    }
    
    
   public static void generarDatos()
   {
       /* Creamos algunos departamentos */
       
        aDepartamento = new Departamento[3];
        aDepartamento[0] = new Departamento();
        aDepartamento[0].setNombre("Gestion");
        aDepartamento[1] = new Departamento();
        aDepartamento[1].setNombre("Informatica");
        aDepartamento[2] = new Departamento();
        aDepartamento[2].setNombre("Robotica");
        
        /* creamos contratos */
        
        aContrato = new Contrato[3];
        aContrato[0] = new Contrato();
        aContrato[0].setDescripcion("Indefinido");
        aContrato[1] = new Contrato();
        aContrato[1].setDescripcion("Practicas");
        aContrato[2] = new Contrato();
        aContrato[2].setDescripcion("Parcial"); 
  
   
   
  /*  crear usuario administrador */
   

    administrador = new Personal();
    administrador.setUsuario("Castillo");
    administrador.setContraseña("123");
    
 
    }
   
   public static void comprobarUsuario(String Usuario, String Contraseña){
       
       boolean check = false;
       
      
     
       if(Usuario.equals(administrador.getUsuario())&& Contraseña.equals(administrador.getContraseña())){
           
           check = true;
              v.setVisible(false);
              vAlta = new VentanaAlta();
             vAlta.setVisible(true);
          
        
       }
       else {
           
           
          cErrores++;
           JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos te quedan " + cErrores + " intentos");
        
       
                 if (cErrores == 3){
        
        
                  JOptionPane.showMessageDialog(null, "No estas autorizado para entrar al tren del mame");
                 v.setVisible(false);
    }
           
       }
         
    
    
   
      
          
           
       
       
      
      
  

      
       
       
       
   }

        
 
        
    
}
