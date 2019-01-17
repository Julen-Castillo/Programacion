
package MisClases;

import java.util.ArrayList;


public class Empresa {
    
 private String nombre;
 private ArrayList<Cliente>listaClientes;
 private ArrayList <Empleado>listaEmpleados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empresa(String nombre, ArrayList<Cliente> listaClientes, ArrayList<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
        this.listaEmpleados = listaEmpleados;
    }

  
    public void setEmpleado (Empleado e) {
        listaEmpleados.add(e);
        
    }
    public Empleado getEmpleado (int x){
       return listaEmpleados.get(x);

}

}

    

