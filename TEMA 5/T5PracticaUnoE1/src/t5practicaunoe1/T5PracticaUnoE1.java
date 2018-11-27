/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5practicaunoe1;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class T5PracticaUnoE1 {

   
    public static void main(String[] args) {
        
   
    ArrayList<Double> principal = IniciarArrayList();
   
     Menu(principal);
    
    
    
    
    }
    
    
    public static void Menu(ArrayList<Double> principal){
        
    int opcion = 0;
    
    do  {
        
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion \n"
                                                                + "1.Visualizar Max y Min \n"
                                                                + "2.Buscar Numero \n"
                                                                + "3.Buscar Numero y borrar \n"
                                                                + "4.Convertir ArrayList en Array \n"
                                                                + "5.Si no esta vació buscar numero \n"
                                                                + "6.Insertar elemento al final \n"
                                                                + "7.Inserrtar elemento en posicion indicada \n"
                                                                + "8.Borrar elemento de posicion indicada"
                                                                + "9.Calcular la suma \n"
                                                                + "10.Salir \n"));
                    
                    
                                                                   
            
            if (opcion > 3 || opcion < 1) {
                JOptionPane.showMessageDialog(null, "error");
        }
            
            switch (opcion) {
                
                case 1:
                    VisualizarMaxMin(principal);
                    break;
                               
                case 2:
                    BuscarNum();
                    break;
                    
                    
                case 3:
                    BuscarNumBorrar();
                    break;
                             
                case 4:
                    ConvertirArray();
                    break;   
                    
                          
                case 5:
                    BuscarNumNoVacio();
                    break;
                    
                          
                case 6:
                   InsertarNumFinal();
                    break;
                    
                          
                case 7:
                    InsertarNumPosicion();
                    break;
                    
                          
                case 8:
                    BorrarElementoPosicion();
                    break;
                    
                    
                          
                case 9:
                    CalcularSuma();
                    break;
                    
         
                case 10:
                    SalirPrograma();
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
        double min = 100;
        for (int i = 0; i < principal.size(); i++) {
            if (principal.get(i) < min) {
                min = principal.get(i);
            }
        }
        JOptionPane.showMessageDialog(null,"Máximo: " + max + " y " + "Minimo: " + min);

        }

        
        
        
        
        
        
        
        
        
            
            
            
            
        } 

}



    

