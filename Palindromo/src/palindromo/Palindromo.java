/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Teclea una cadena");
        boolean palindromo = fPalindromo (cadena);
        if (palindromo)
                JOptionPane.showMessageDialog(null, " la cadena " + cadena + " si es palindromo");
                        
        else
                JOptionPane.showMessageDialog(null, " la cadena " + cadena + " no es palindromo");
                        }        
    public static boolean fPalindromo (String cadena)
   
    {
        return true;
    }
}
    

