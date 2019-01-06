
package MisClases;


public class Cliente extends Persona {

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public Cliente(String telefono_de_contacto, String nombre, Integer edad) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }
    
    private String telefono_de_contacto;
    
     
     public void mostrar(){}
}
