 
package main;

import Clases.Equipo;
import Clases.Jugador;
import Clases.Puesto;
import Excepciones.ExceptionGenerica;
import Vistas.VentanaAlta;
import java.sql.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.text.Position;


public class Main {
    
    
  
    private static Puesto aPuestos[];
    private static Puesto oPuesto;
    private static ArrayList<Jugador> listaJugadores;
    private static ArrayList<Equipo> listaEquipos;
    private static Jugador jugador;
    private static Equipo equipo;
    private static VentanaAlta vAltas;
    
   

  
    public static void main(String[] args) {
        
   llenarDatos();
   crearVentana();
  
 
       
    }
    
    
    public static void llenarCombobox(JComboBox comboPuesto){
        
      for(int x = 0; aPuestos.length > x; x++){
        
             comboPuesto.addItem(aPuestos[x].getNombrePuesto());
             comboPuesto.setSelectedItem(-1);
           
        
        
         }
    }
    
    public static void llenarDatos(){
        
           aPuestos = new Puesto[4];
           
           aPuestos[0] = new Puesto();
           aPuestos[0].setNombrePuesto("Delantero");
           aPuestos[1] = new Puesto();
           aPuestos[1].setNombrePuesto("Mediocentro");
           aPuestos[2] = new Puesto();
           aPuestos[2].setNombrePuesto("Defensa");
           aPuestos[3] = new Puesto();
           aPuestos[3].setNombrePuesto("Portero");
        
          
     
    }
    public static void darAlta(String nombreEquipo, String escudo, String nombreJugador, int comboPuestos, String dorsal){
        
        
        // Crear objeto Equipo y meterle los valores
        equipo = new Equipo();
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setEscudo(escudo);
        equipo.setlJugadores(listaJugadores);
        
        
        //Crear arraylist de equipos y meter el objeto equipo
        listaEquipos = new ArrayList<Equipo>();
        listaEquipos.add(equipo);
        
        
        //crear el objeto Jugador y meterle los valores
        
        jugador = new Jugador();
        jugador.setNombreJugador(nombreJugador);
        jugador.setPuesto(aPuestos[comboPuestos]);
        jugador.setDorsal(dorsal);
        jugador.setEquipoJugador(equipo);
         
        
        //Crear arraylist de jugadores y meter el objeto jugador 
         listaJugadores = new ArrayList<Jugador>();  
         listaJugadores.add(jugador);
        
        
    }
    public static void crearVentana(){
        vAltas = new VentanaAlta();
        vAltas.setVisible(true);
       
           
        
          
        
    }
    
    public static void darAltaJugadores(String nombre, int comboPuesto, String dorsal) {
        
        jugador = new Jugador();
        jugador.setNombreJugador(nombre);
        jugador.setPuesto(aPuestos[comboPuesto]);
        jugador.setDorsal(dorsal);
        
        
    }


    public static void Salir() {
       
        System.exit(0);
    }
         public static String mostrarDatos(){
        return listaEquipos.toString();
    }
}

