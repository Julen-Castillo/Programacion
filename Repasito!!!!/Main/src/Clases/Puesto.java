

package Clases;

import java.util.ArrayList;


public class Puesto {
    
    private String nombrePuesto;
    private ArrayList<Jugador> lJugadores;

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public ArrayList<Jugador> getlJugadores() {
        return lJugadores;
    }

    public void setlJugadores(ArrayList<Jugador> lJugadores) {
        this.lJugadores = lJugadores;
    }

    public Puesto(String nombrePuesto, ArrayList<Jugador> lJugadores) {
        this.nombrePuesto = nombrePuesto;
        this.lJugadores = lJugadores;
    }

    

    public Puesto() {
    }
    
    
}
