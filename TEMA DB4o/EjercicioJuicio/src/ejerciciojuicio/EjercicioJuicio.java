
package ejerciciojuicio;

import Modelo.Cliente;
import Modelo.Persona;
import ModeloBD.ClienteBD;
import Vista.Alta;
import Vista.Menu;


public class EjercicioJuicio {
    
    public static Menu vmenu;
    public static Persona c;
    public static Cliente cl;
    public static Alta va;
    

   
    public static void main(String[] args) {
        crearVentana();
        

    }
    
    public static void crearVentana(){
        
        vmenu = new Menu();
        vmenu.setVisible(true);
    }
    
    public static void darAlta(String dni, String nombre, String apellidos, String direccion, Integer telefono) throws Exception{
        cl = new Cliente(dni,nombre,apellidos,direccion,telefono);
        
        ClienteBD.alta(cl);
        
       
    }
    
    public static void Consultar (String dni) throws Exception{
       cl = new Cliente(dni);
       
   cl =  ClienteBD.consultar(cl);
  // if(cl == null)
  
         va = new Alta();
       
       if(va.Confirmar()== true){
           ClienteBD.borrar(cl);
           
       }
       
    }
    
}
