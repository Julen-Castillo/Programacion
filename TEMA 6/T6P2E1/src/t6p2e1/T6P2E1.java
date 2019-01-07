
package t6p2e1;

import Modelo.*;
import java.util.ArrayList;
import javax.xml.bind.helpers.NotIdentifiableEventImpl;


public class T6P2E1 {
    
    
    //Todos los estudios que existen en el mundo
    private static Estudio[] listaEstudios = new Estudio[5];
    
    //Todos las peliculas que existen en el mundo
    
    private static ArrayList<Pelicula> listaPeliculas;
    

   
    public static void main(String[] args) {
        
        
       crearEstudios();
       crearPeliculas();
       buscarPeliculaMasLarga();
       buscarEstudioConMasPeliculas();
       
    
        
    }
    
    public static void crearEstudios(){
        
       ArrayList <String> telefonos = new ArrayList();
        
        telefonos.add("1111111");
        telefonos.add("2222222");
        listaEstudios[0] = new Estudio("Warner","Paris","C/5","www.yukatan.es","Francia",telefonos,"10/12/1999");
        
       
        telefonos = new ArrayList();
        
          
        telefonos.add("1111112");
        telefonos.add("2222223");
        listaEstudios[1] = new Estudio("Willy","Uganda","C/4","www.willyfo.es","Sopadopa",telefonos,"10/12/1992");
        
        
        
         telefonos = new ArrayList();
        
         telefonos.add("1111113");
         telefonos.add("2222224");
       
        listaEstudios[3] = new Estudio("Vegetta","España","C/5","www.vegetita.es","EspañaOtraVeh",telefonos,"10/12/1995");
        
         
        
        
        telefonos = new ArrayList();
        
         telefonos.add("1111114");
         telefonos.add("2222225");
       
        listaEstudios[4] = new Estudio("AntonioJose","Haiti","C/5","www.terremoto.com","Puerto Principe",telefonos,"10/12/1992");
        
        
        
          telefonos = new ArrayList();
        
         telefonos.add("1111115");
         telefonos.add("2222226");
       
        listaEstudios[5] = new Estudio("Cani","Sevilla","C/5","www.comprooro.com","España",telefonos,"10/12/1993");
        
        

        
    
}
        public static void crearPeliculas(){
            
            ArrayList<Estudio>estudios = new ArrayList();
            
            estudios.add(listaEstudios[5]);
            estudios.add(listaEstudios[3]);
            
            
      listaPeliculas.add(new Pelicula("PiniPon",'1',60.6f,"Infantil",estudios));
      
            
            
              estudios = new ArrayList();
              estudios.add(listaEstudios[2]);
              estudios.add(listaEstudios[1]);
            
              
            
    
}
}
