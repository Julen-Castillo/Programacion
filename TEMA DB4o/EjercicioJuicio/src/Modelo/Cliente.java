
package Modelo;

import java.util.ArrayList;


public class Cliente extends Persona {

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Caso> getArCasos() {
        return arCasos;
    }

    public void setArCasos(ArrayList<Caso> arCasos) {
        this.arCasos = arCasos;
    }


   
    
    

    private int telefono;
    private ArrayList<Caso> arCasos;


    public Cliente() {
    }

    public Cliente(String DNI) {
        super(DNI);
    }

    public Cliente(String DNI, String nombre, String apellidos, String direccion,int telefono) {
        super(DNI, nombre, apellidos, direccion);
        this.telefono = telefono;
    }

 

  
    
 
    
}
