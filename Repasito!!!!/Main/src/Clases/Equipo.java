
package Clases;


public class Equipo {
    
    
  private String nombreEquipo;
  private String escudo;


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


    }
  
  
    

