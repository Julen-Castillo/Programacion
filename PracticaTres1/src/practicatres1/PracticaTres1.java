/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatres1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class PracticaTres1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String Horas = JOptionPane.showInputDialog("Teclea el numero de horas trabajadas");
         int horas = Integer.parseInt(Horas);
        String HoraExtra = JOptionPane.showInputDialog("Teclea el numero de horas extra trabajadas");
         int horaextra = Integer.parseInt(HoraExtra);
         String EstadoCivil = JOptionPane.showInputDialog("Teclea tu Estado Civil");
        String Estudios = JOptionPane.showInputDialog("Teclea tus estudios");
             
       
    }
    
}
