
package Modelo;

import java.util.ArrayList;

public class Abogado extends Persona{
    
private ArrayList<Caso> aCasos;

    public Abogado(ArrayList<Caso> aCasos) {
        this.aCasos = aCasos;
    }

    public Abogado(ArrayList<Caso> aCasos, String DNI, String nombre, String apellidos, String direccion) {
        super(DNI, nombre, apellidos, direccion);
        this.aCasos = aCasos;
        aCasos = new ArrayList();
    }

    public Abogado() {
    }

    public Abogado(String DNI, String nombre, String apellidos, String direccion) {
        super(DNI, nombre, apellidos, direccion);
    }

    public ArrayList<Caso> getaCasos() {
        return aCasos;
    }

    public void setaCasos(ArrayList<Caso> aCasos) {
        this.aCasos = aCasos;
    }
  
    
}
