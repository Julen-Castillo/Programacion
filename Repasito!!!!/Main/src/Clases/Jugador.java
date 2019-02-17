
package Clases;

public class Jugador {
    
   //Atributos
    
    private String nombreJugador;
    private String dorsal;

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public Puesto getPuesto() {
        return p;
    }

    public Jugador() {
    }

    public void setPuesto(Puesto puesto) {
        this.p = puesto;
    }

    public Jugador(String nombreJugador, String dorsal, Puesto puesto) {
        this.nombreJugador = nombreJugador;
        this.dorsal = dorsal;
        this.p = puesto;
    }
      
      
      
   //Relacion   
    private Puesto p;
  
    
    
}
