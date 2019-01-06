
package MisClases;

public class Directivo extends Empleado{
    
    
    
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
      public void mostrar(){}

    public Directivo(String categoria, Integer sueldo_bruto, String nombre, Integer edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
    }
}
