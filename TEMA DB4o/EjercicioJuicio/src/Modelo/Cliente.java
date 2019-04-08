
package Modelo;

import java.util.ArrayList;


public class Cliente extends Persona {

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Cliente(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Caso> getArCasos() {
        return arCasos;
    }

    public void setArCasos(ArrayList<Caso> arCasos) {
        this.arCasos = arCasos;
    }

    public Cliente(int telefono, ArrayList<Caso> arCasos) {
        this.telefono = telefono;
        this.arCasos = arCasos;
    }

    public Cliente(int telefono, ArrayList<Caso> arCasos, String DNI, String nombre, String apellidos, String direccion) {
        super(DNI, nombre, apellidos, direccion);
        this.telefono = telefono;
        this.arCasos = arCasos;
    }

    public Cliente(String DNI, String nombre, String apellidos, String direccion, int telefono) {
        super(DNI, nombre, apellidos, direccion);
        this.telefono = telefono;
    }

   
    
    

    private int telefono;
    private ArrayList<Caso> arCasos;


    public Cliente() {
    }

 

  
    
 
    
}
