
package Clases;

import java.util.ArrayList;

public class Departamento {
    
    
    
    public String nombre;
    private ArrayList<Empleados> listaEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }
   
    
    public Departamento() {
    }

    public Departamento(String Nombre, ArrayList<Empleados> listaEmpleados) {
        this.nombre = Nombre;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    

    
}
