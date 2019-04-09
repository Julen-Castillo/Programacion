
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;


public class Caso {
    
    private Integer Id;
    private LocalDate fechaInicio;

    private String dominio; //tramite o archivado
    
    private Cliente cliente;
    private ArrayList<Abogado> aAbogados;

    public Caso() {
    }

    public Caso(Integer Id, LocalDate fechaInicio, LocalDate fechaFin, String dominio, Cliente cliente, ArrayList<Abogado> aAbogados) {
        this.Id = Id;
        this.fechaInicio = fechaInicio;

        this.dominio = dominio;
        this.cliente = cliente;
        this.aAbogados = aAbogados;
    }
  

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

  

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Abogado> getaAbogados() {
        return aAbogados;
    }

    public void setaAbogados(ArrayList<Abogado> aAbogados) {
        this.aAbogados = aAbogados;
    }

   
   
    
}
