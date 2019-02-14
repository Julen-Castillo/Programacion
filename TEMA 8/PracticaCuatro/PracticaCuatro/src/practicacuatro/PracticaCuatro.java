
package practicacuatro;

import Clases.Contrato;
import Clases.Departamento;
import Clases.Empleados;
import Clases.Personal;
import Vista.InicioSesion;
import Vista.Menu;
import Vista.VentanaAlta;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class PracticaCuatro {

    private static Departamento aDepartamento[];
    private static Contrato aContrato[];
    private static ArrayList<Personal> lPersonal;
    private static Personal administrador;
    private static int posicionNum;
   
    private static ArrayList<Empleados> aEmpleado;
    
    private static Empleados oEmpleado;
    
      //Alta o modificacion
    
    private static String operacion;
    
    
    
    /* Contador fallos */
    
    private static int cErrores = 0;
    
    private static InicioSesion v;
    private static VentanaAlta vAlta;
    private static Menu vMenu;
  
   
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
  
        lPersonal = new ArrayList<Personal>();
    
        administrador = new Personal("Castillo","123");
    
    
        lPersonal.add(administrador);
        
       aEmpleado = new ArrayList<Empleados>();
       
       oEmpleado = new Empleados("12345678F","11111111","Julen","Castillo","C/Arrabal N5","666666666",'M','S',"05/02/2019","0001",
               aContrato[0],aDepartamento[0],lPersonal.get(0));
       aEmpleado.add(oEmpleado);

       
  
   
  /*  crear usuario administrador */
    
        lPersonal = new ArrayList<Personal>();
    
    administrador = new Personal();
    
    administrador.setUsuario("a");
    administrador.setContraseña("a");
    
    lPersonal.add(administrador);
    
    
 
    }
   
   public static void comprobarUsuario(String Usuario, String Contraseña){
       
       boolean check = false;

     
       if(Usuario.equals(administrador.getUsuario())&& Contraseña.equals(administrador.getContraseña())){           
            check = true;
            v.setVisible(false);
            vMenu = new Menu();
            vMenu.setVisible(true);       
       }
       else {         
          cErrores++;
           JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos has fallado " + cErrores + " veces");
           
                 if (cErrores == 3){
  
                  JOptionPane.showMessageDialog(null, "No estas autorizado para entrar al tren del mame");
                 v.setVisible(false);
    }            
   }
   }
   
   public static void crearVentanaPersona(String operacion){
       
       
      
       vMenu.setVisible(false);
       vAlta = new VentanaAlta(operacion);
       vAlta.setVisible(true);
       
       
       
               
       
   }
   
      public static void  llenarCombobox(JComboBox combo){
          for(int x = 0; aContrato.length > x; x++){
                combo.addItem(aContrato[x].getDescripcion());
                
                combo.setSelectedItem(-1);
               	
          }
          
         
    
   }
      public static void llenarCombobox2(JComboBox combo2){
          combo2.removeAllItems();
          for(int y = 0; aDepartamento.length > y; y++){
             combo2.addItem(aDepartamento[y].getNombre());
             
                          combo2.setSelectedItem(-1);
          
//          no puedo añadir los objetos Departamento a el combobox de departamento (no se ven) ((ARREGLADO))
      }
      }
      
      public static void darAlta(String dni,String nss,String nombre, String apellido, String direccion, String telefono,
              Character sexo, Character estadoCivil,int tipoContrato,  int departamento,String fechaAlta, String numEmpleado) {
 
          
         oEmpleado = new Empleados();
         oEmpleado.setDni(dni);
         oEmpleado.setNss(nss);
         oEmpleado.setNombre(nombre);
         oEmpleado.setApellidos(apellido);
         oEmpleado.setDireccion(direccion);
         oEmpleado.setTelefno(telefono);
         oEmpleado.setSexo(sexo);
         oEmpleado.setEstadoCivil(estadoCivil);
         oEmpleado.setC(aContrato[tipoContrato]);
         oEmpleado.setD(aDepartamento[departamento]);
         oEmpleado.setFechaAlta(fechaAlta);
         oEmpleado.setNumeroEmpleado(numEmpleado);
         
           aEmpleado.add(oEmpleado);
                 

    }
      
      public static void modificarDatos(String nombre, String apellido, String direccion, String telefono,Character sexo, Character estadoCivil, int tipoContrato, int departamento){
          
          int x;
       
          
          
      }

      
      public static boolean buscarEmpleado(String numero){

          
             int x;          
             for ( x = 0; x < aEmpleado.size() && aEmpleado.get(x).getNumeroEmpleado().equals(numero) == false; x++){}

             
            if (x == aEmpleado.size())
                return false;
         
            
                     
              else  oEmpleado = aEmpleado.get(x);   
            
          
              posicionNum = x ;
              
                String dni = aEmpleado.get(posicionNum).getDni();
                String nss = aEmpleado.get(posicionNum).getNss();
                String nombre = aEmpleado.get(posicionNum).getNombre();
                String apellido = aEmpleado.get(posicionNum).getApellidos();
                String direccion = aEmpleado.get(posicionNum).getDireccion();
                String telefono = aEmpleado.get(posicionNum).getTelefno();
                char sexo = aEmpleado.get(posicionNum).getSexo();
                char estadocivil = aEmpleado.get(posicionNum).getEstadoCivil();
                String contrato = aEmpleado.get(posicionNum).getC().getDescripcion();
                String departamento = aEmpleado.get(posicionNum).getD().getNombre();
                String fecha = aEmpleado.get(posicionNum).getFechaAlta();
                String numEmple = aEmpleado.get(posicionNum).getNumeroEmpleado();  
                
           vAlta.llenarDatosModificacion(dni,nss,nombre,apellido,direccion,telefono,sexo,estadocivil,contrato,departamento,fecha,numEmple);
          
                 return true; 
                         
    }
                    
}
      
      
      
      
   
   
       



