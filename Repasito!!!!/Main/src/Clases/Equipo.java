
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;


public class Equipo {
    
    
  private String nombreEquipo;
  private String escudo;
  private ArrayList<Jugador> lJugadores = new ArrayList<Jugador>();
  private LocalDate fechaAlta;


    public Equipo(String nombreEquipo, String escudo, ArrayList<Jugador> lJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.escudo = escudo;
        this.lJugadores = lJugadores;
    }

    public ArrayList<Jugador> getlJugadores() {
        return lJugadores;
    }

    public void setlJugadores(ArrayList<Jugador> lJugadores) {
        this.lJugadores = lJugadores;
    }


    public Equipo(String nombreEquipo, String escudo) {
        this.nombreEquipo = nombreEquipo;
        this.escudo = escudo;
        
      
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public Equipo() {
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", escudo=" + escudo + ", lJugadores=" + lJugadores + '}'+ "\n";
    }


    }
  
  
    

