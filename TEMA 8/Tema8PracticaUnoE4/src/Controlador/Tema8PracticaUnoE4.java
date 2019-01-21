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
import java.util.ArrayList;


public class Tema8PracticaUnoE4 {
    
     private static Ventana1 v1;
     private static VentanaCompras vCompras;
     private static VentanaVentas vVentas;
    
        int[] listaZanahorias = new int[7];
        int[] listaPlatanos = new int[7];
        int[] listaCebollas = new int[7];
        private int pZanahoria;
        private int pPlatano;
         private int pCebolla;
         private int pFinal; 
         private int cZanahorias;
         private int cCebollas;
         private int cPlatanos;
  
   
 
    


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
    
    
    public static void contadorProductos (String producto, String unidad){
        
        
        
    }
    
    
}
