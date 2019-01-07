
package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Estudio {
private String nombre;
private String ciudad;
private String direccion;
private String dirWeb;

//LocalDate
private String pais;
private ArrayList<String> telefonos;
private String fechaFundacion; 

    public Estudio(String nombre, String ciudad, String direccion, String dirWeb, String pais, ArrayList<String> telefonos, String fechaFundacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.pais = pais;
        this.telefonos = telefonos;
        this.fechaFundacion = fechaFundacion;
    }

    public Estudio() {
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }




}


/* private ArrayList <Pelicula>       || clase extend para herencia */

  