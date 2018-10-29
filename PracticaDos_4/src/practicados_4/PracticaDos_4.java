/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class PracticaDos_4 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // con date
        try {
              String fechaString = JOptionPane.showInputDialog("Teclea una fecha");
                SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yy");
                Date fechaUno = formatter.parse(fechaString);
                
                fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
                Date fechaDos = formatter.parse(fechaString);
        
                //resta 
                Long milisegundos = fechaUno.getTime() - fechaDos.getTime();
                // 24 horas * 60 minutos * 60 segundos * 1000 milisegundos = 86.400000
                Long dias = milisegundos / 86400000;
                JOptionPane.showMessageDialog(null,"La diferencia es de " + dias + " dias" );
       
        } catch (Exception e){ JOptionPane.showMessageDialog(null,"El valor introducido es incorrecto");
       
        
        }
     

                

	}
    }

    

