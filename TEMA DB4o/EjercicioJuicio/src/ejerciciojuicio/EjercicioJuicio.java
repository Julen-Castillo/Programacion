
package ejerciciojuicio;

import Vista.Menu;


public class EjercicioJuicio {
    
    public static Menu vmenu;

   
    public static void main(String[] args) {
        crearVentana();
        

    }
    
    public static void crearVentana(){
        
        vmenu = new Menu();
        vmenu.setVisible(true);
    }
    
}
