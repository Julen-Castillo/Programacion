
package Clase;

import java.util.ArrayList;


public class Socio {
     private String nombre;
     private String apellido;
     private String Telefono;
     private String CorreoElectronico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public Socio(String nombre, String apellido, String Telefono, String CorreoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Telefono = Telefono;
        this.CorreoElectronico = CorreoElectronico;
    }

    public Socio() {
    }
     
}
