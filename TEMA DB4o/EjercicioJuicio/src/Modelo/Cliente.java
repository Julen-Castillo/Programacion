
package Modelo;

import java.util.ArrayList;


public class Cliente extends Persona {

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Caso> getArCasos() {
        return arCasos;
    }

    public void setArCasos(ArrayList<Caso> arCasos) {
        this.arCasos = arCasos;
    }

    public Cliente(String telefono, ArrayList<Caso> arCasos) {
        this.telefono = telefono;
        this.arCasos = arCasos;
    }

    public Cliente(String telefono, ArrayList<Caso> arCasos, String DNI, String nombre, String apellidos, String direccion) {
        super(DNI, nombre, apellidos, direccion);
        this.telefono = telefono;
        this.arCasos = arCasos;
    }
    
    

    private String telefono;
    private ArrayList<Caso> arCasos;


    public Cliente() {
    }

 

  
    
 
    
}