/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5practicaunoe1;

import java.util.ArrayList;
import java.util.PrimitiveIterator;
import javax.swing.JOptionPane;
import sun.awt.image.IntegerComponentRaster;


public class T5PracticaUnoE1 {

   
    public static void main(String[] args) {
        
   
    ArrayList<Double> principal = IniciarArrayList();
   
     Menu(principal);
    
    
    
    
    }
    
    
    public static void Menu(ArrayList<Double> principal){
        
    int opcion = 0;
    
    do  {
        
          JOptionPane.showMessageDialog(null, "este es tu array " + principal);
        
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion \n"
                                                                + "1.Visualizar Max y Min \n"
                                                                + "2.Buscar Numero \n"
                                                                + "3.Buscar Numero y borrar \n"
                                                                + "4.Convertir ArrayList en Array \n"
                                                                + "5.Si no esta vació buscar numero \n"
                                                                + "6.Insertar elemento al final \n"
                                                                + "7.Inserrtar elemento en posicion indicada \n"
                                                                + "8.Borrar elemento de posicion indicada \n"
                                                                + "9.Calcular la suma \n"
                                                                + "10.Salir \n"));
                    
                    
                                                                   
            
            if (opcion > 10 || opcion < 1) {
                JOptionPane.showMessageDialog(null, "error");
        }
            
            switch (opcion) {
                
                case 1:
                    VisualizarMaxMin(principal);
                    break;
                               
                case 2:
                    BuscarNum(principal);
                    break;
                    
                    
                case 3:
                    BuscarNumBorrar(principal);
                    break;
                             
                case 4:
                    ConvertirArray(principal);
                    break;   
                    
                          
                case 5:
                    BuscarNumNoVacio(principal);
                    break;
                    
                          
                case 6:
                   InsertarNumFinal(principal);
                    break;
                    
                          
                case 7:
                    InsertarNumPosicion(principal);
                    break;
                    
                          
                case 8:
                    BorrarElementoPosicion(principal);
                    break;
                    
                    
                          
                case 9:
                    CalcularSuma(principal);
                    break;
                    
         
                case 10:
                    SalirPrograma(principal);
                    break;
                default:
                    break;
            }
             } while (opcion != 3);       
      
        }
    
  
       
        public static ArrayList <Double> IniciarArrayList(){ 
            
        ArrayList <Double> principal = new ArrayList();
        
        int continuar;
 
        do {
        
        principal.add(Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero")));           
          
        continuar = JOptionPane.showConfirmDialog(null, "Quieres continuar?");
        
         
        
        }while (continuar == 0);
        
        return principal;
            
          
        }
        
    public static void VisualizarMaxMin(ArrayList<Double> principal){ 
        
   
        
        
          double max = 0;
        for (int i = 0; i < principal.size(); i++) {
            if (principal.get(i) > max) {
                max = principal.get(i);
            }
        }
        double min = 1000;
        for (int i = 0; i < principal.size(); i++) {
            if (principal.get(i) < min) {
                min = principal.get(i);
            }
        }
        JOptionPane.showMessageDialog(null,"Máximo: " + max + " y " + "Minimo: " + min);

        }
    
    
    

        

        public static void BuscarNum(ArrayList<Double> principal){ 
            
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
            
            for (int x = 0; x < principal.size(); x++){
                
                
              if (numero == principal.get(x)){
                  
                  JOptionPane.showMessageDialog(null, "Tu numero existe");
           
              }
              
      
                  
                  
            }
     
        } 
        
      public static void BuscarNumBorrar(ArrayList<Double> principal){    
          
          
          double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
         
       
              
               if (principal.contains(numero)){
                   
                   principal.remove(numero);
                   JOptionPane.showMessageDialog(null, "Tu numero ha sido exterminado");
               }
               
               else { JOptionPane.showMessageDialog(null, "Tu numero no se puede borrar ya que no existe, saludos");
               
               }
          }

      
      
      
      
      
  public static void  BuscarNumNoVacio(ArrayList<Double>principal){
      
      String valor = "";
        for(int x = 0; x < principal.size(); x++){
         JOptionPane.showMessageDialog(null, "Valor " + principal.get(x) + " en la posicion "+ (x+1) );
        }
 
  }
  
  
  public static void InsertarNumFinal(ArrayList<Double>principal){
      
      principal.add(Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"))); 
      
      JOptionPane.showMessageDialog(null, "El numero se ha añadido en la ultima posicion");
      
      
  }
  
   public static void InsertarNumPosicion(ArrayList<Double>principal){
       
       double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
       
       int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce un posicion"));
       

      principal.add(posicion,numero);
       
       
       
   }
  
  public static void BorrarElementoPosicion(ArrayList<Double>principal){
  
      JOptionPane.showMessageDialog(null, "este es tu array " + principal);
      
      int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce un posicion para borrar su elemento"));
      

      
         principal.remove(posicion-1);
         
         JOptionPane.showMessageDialog(null, "Hemos borrado el valor de la posicion introducida");
         
            JOptionPane.showMessageDialog(null, "este es tu array despues de eliminar la posicion " + principal);
  
  }
  
  
 public static void CalcularSuma(ArrayList<Double>principal){
     
    
     double suma = 0;
     
     for (int x = 0; x < principal.size();x++)
         
         suma = suma + principal.get(x);
     
     JOptionPane.showMessageDialog(null, "La suma de todos los numeros es: " + suma + " y la media aritmetica es: " + suma/principal.size());
     
     
 
 }
 public static void SalirPrograma(ArrayList<Double>principal) {
        System.exit(0);
 
 
 }
 
 public static void ConvertirArray(ArrayList<Double>principal) {
     
     Double[] array;
     array = principal.toArray(new Double[principal.size()]);
}
}
  


    
        
      

        

       
   
       
  
     
    
       
           
           
           
       
        
        
        
    
        
        
        
        
        
        
    
    



    




    


            