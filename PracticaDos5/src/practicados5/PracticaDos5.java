/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class PracticaDos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaString = JOptionPane.showInputDialog("introduce fecha en este formato dd/MM/yyyy");
            LocalDate fechaUno = LocalDate.parse(fechaString, formatter).plusDays(100);
          //  fechaUno.getDayOfMonth();
            Month mes = fechaUno.getMonth();
            DayOfWeek dia = fechaUno.getDayOfWeek();
            int año = fechaUno.getYear();
         
            
            
           // DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("E, dd MM yy");
           // LocalDate fechaFinal = LocalDate.parse(fechaString, formatter);
      

            JOptionPane.showMessageDialog(null,"Es el " + dia + " de "+ mes + " de " +  año);
            
            
        // TODO code application logic here
    }
    
}
