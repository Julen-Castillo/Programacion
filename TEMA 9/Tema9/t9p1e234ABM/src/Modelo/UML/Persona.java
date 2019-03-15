/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.UML;

/**
 *
 * @author 1gdaw03
 */
public class Persona {

    public Persona(String dni, String nombre, String telefono) {
    }

    

   
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Persona(String dni, String nombre, String telefono, Empresa empresa) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.empresa = empresa;
    }

    public Persona() {
    }
    
    private String dni;
    private String nombre;
    private String telefono;
    private Empresa empresa;
}
