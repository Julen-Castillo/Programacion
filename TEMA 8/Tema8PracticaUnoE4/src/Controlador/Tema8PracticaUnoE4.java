/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Verduras;
import Vista.Ventana1;
import Vista.VentanaCompras;
import Vista.VentanaVentas;
import com.sun.org.apache.xml.internal.serializer.ToStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Tema8PracticaUnoE4 {
    
     private static Ventana1 v1;
     private static VentanaCompras vCompras;
     private static VentanaVentas vVentas;
    
         public static ArrayList<Verduras> listaProductos;
        public int pZanahoria;
        public int pPlatano;
           public int pCebolla;
        public int pFinal; 
    
       public static int Contador;
  
   
 
    


    public static void main(String[] args) {   
      
         mostrarVentana();

         
        
    }
    
    
    public static void mostrarVentana(){
        v1 = new Ventana1();
        v1.setVisible(true);
    }
    
    
    
    public static void crearVentanaComprar(){
        
       vCompras = new VentanaCompras();
       v1.setVisible(false);
       vCompras.setVisible(true);
        
        
    }
    
    
    public static boolean buscarProductos (String producto){
            
        
        int x;
        for (x = 0; x < listaProductos.size() && listaProductos.get(x).getNombre().compareTo(producto)!=0; x++){}
        
        if (listaProductos.size() == x){
            
            return false;
  
        }
       else {
                       
               Contador = x;
               System.out.println(Contador);
        
             return true;
        }        
}
    public static void aceptarCompras(String producto, int unidad){
      
    /*    buscarProductos(producto); si dejo esto sin comentar se me va a ejecutar dos veces  por la linea de abajo */
        
        boolean comprobador =  buscarProductos(producto);        
        if (comprobador == true){           
            listaProductos.get(Contador).comprar(unidad);
        }     
        else { JOptionPane.showMessageDialog(null, "NO tienes ese producto");
        
    }
    }
}
