
package Clases;

public class Verduras {
   private String Nombre;
   private int Precio;
   private int Unidades;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public Verduras(String Nombre, int Precio, int Unidades) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Unidades = Unidades;
    }

    public Verduras() {
    }

    @Override
    public String toString() {
        return "Verduras{" + "Nombre=" + Nombre + ", Precio=" + Precio + ", Unidades=" + Unidades + '}';
    }
    
    public void comprar (int unidadesCompradas){
        
        Unidades += unidadesCompradas;
    }
    
        public void vender (int unidadesVendidas){
            
        Unidades = Unidades - unidadesVendidas;
            
        }
        }

    
    
   
    
