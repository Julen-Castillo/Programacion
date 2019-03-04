
package Modelo;

import java.time.LocalDate;

public class Evento {
    
    
    private int Id;
    private String nombre;
    private String localizacion;
    private LocalDate fecha;
    private LocalDate horaInicio;
    private LocalDate horaFin;
    private int limitePersonas;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalDate horaFin) {
        this.horaFin = horaFin;
    }

    public int getLimitePersonas() {
        return limitePersonas;
    }

    public void setLimitePersonas(int limitePersonas) {
        this.limitePersonas = limitePersonas;
    }

    public Evento(int Id, String nombre, String localizacion, LocalDate fecha, LocalDate horaInicio, LocalDate horaFin, int limitePersonas) {
        this.Id = Id;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.limitePersonas = limitePersonas;
    }
    

    public Evento() {
    }

    
}
