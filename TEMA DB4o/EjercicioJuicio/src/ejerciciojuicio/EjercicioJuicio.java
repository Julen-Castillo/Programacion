
package ejerciciojuicio;

import Modelo.Cliente;
import Modelo.Persona;
import ModeloBD.ClienteBD;
import Vista.Menu;


public class EjercicioJuicio {
    
    public static Menu vmenu;
    public static Persona c;

   
    public static void main(String[] args) {
        crearVentana();
        

    }
    
    public static void crearVentana(){
        
        vmenu = new Menu();
        vmenu.setVisible(true);
    }
    
    public static void darAlta(String dni, String nombre, String apellidos, String direccion) throws Exception{
        c = new Persona(dni,nombre,apellidos,direccion);
        
        ClienteBD.alta(c);

       
    }
    
}
