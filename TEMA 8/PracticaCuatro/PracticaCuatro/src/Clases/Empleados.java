
package Clases;

import java.time.LocalDate;
import java.util.Date;

public class Empleados {
    
    private String dni;
    private String nss;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefno;
    private char sexo;
    private char estadoCivil;
    private String fechaAlta;
    private String numeroEmpleado;
    
    
    private Contrato c;
    private Departamento d;
    private Personal p;

    public Empleados() {
    }

    
    public Empleados(String dni, String nss, String nombre, String apellidos, String direccion, String telefno, char sexo, char estadoCivil, String fechaAlta, String numeroEmpleado, Contrato c, Departamento d, Personal p) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefno = telefno;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.fechaAlta = fechaAlta;
        this.numeroEmpleado = numeroEmpleado;
        this.c = c;
        this.d = d;
        this.p = p;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefno() {
        return telefno;
    }

    public void setTelefno(String telefno) {
        this.telefno = telefno;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Contrato getC() {
        return c;
    }

    public void setC(Contrato c) {
        this.c = c;
    }

    public Departamento getD() {
        return d;
    }

    public void setD(Departamento d) {
        this.d = d;
    }

    public Personal getP() {
        return p;
    }

    public void setP(Personal p) {
        this.p = p;
    }
    
                   
                    
    
}
