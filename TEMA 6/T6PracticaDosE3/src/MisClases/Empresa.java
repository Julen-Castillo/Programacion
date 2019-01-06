
package MisClases;


public class Empresa {
    
 private String nombre;
 private Cliente clientes;
 private Empleado empleados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }

    public Empresa(String nombre, Cliente clientes, Empleado empleados) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.empleados = empleados;
    }
    
}
