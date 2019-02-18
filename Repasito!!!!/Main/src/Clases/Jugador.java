
package Clases;

public class Jugador {
    
   //Atributos
    
    private String nombreJugador;
    private String dorsal;
    private Equipo equipoJugador;
    private Puesto p;
    
    
    public Jugador(String nombreJugador, String dorsal, Equipo equipoJugador, Puesto p) {
        this.nombreJugador = nombreJugador;
        this.dorsal = dorsal;
        this.equipoJugador = equipoJugador;
        this.p = p;
    }

    public Equipo getEquipoJugador() {
        return equipoJugador;
    }

    public void setEquipoJugador(Equipo equipoJugador) {
        this.equipoJugador = equipoJugador;
    }

    public Puesto getP() {
        return p;
    }

    public void setP(Puesto p) {
        this.p = p;
    }

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

    @Override
    public String toString() {
        return "/n" + "Nombre{" + "nombreJugador: " + nombreJugador + "|  dorsal: " + dorsal + "| equipoJugador: " + equipoJugador + "| p=" + p + '}';
    }
   
  
    
    
}
