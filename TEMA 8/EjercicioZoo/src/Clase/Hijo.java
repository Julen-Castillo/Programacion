
package Clase;

public class Hijo {
    
    private String nombre;
    private String fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Hijo() {
    }

    public Hijo(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }
    
    
}
