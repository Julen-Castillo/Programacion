/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados_3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class PracticaDos_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena:");
        String cadena = sc.nextLine(); //leemos la cadena
        System.out.println("Ingrese el caracter a buscar:");
        String caracter = sc.next(); //ya que no contamos con un metodo especifico para
        //los caracteres entonces leemos como cadena, luego obtenemos el primer
        //caracter para almacenarlo en un char, que seria el char que debemos buscar en
        //la primera cadena ingresada
        char car = caracter.charAt(0);
        int cantidadRepeticiones = 0;
        //iteramos hasta que el indice sea menor al tamanio de la cadena
        for (int i = 0 ; i < cadena.length() ; i++) {
            char aux = cadena.charAt(i); //obtenemos el caracter en la posicion i
            if (aux == car) {
                cantidadRepeticiones++;
            }
        }
        //mostramos por pantalla la cantidad de repeticiones
        System.out.println("La cantidad de repeticiones es: " + cantidadRepeticiones);
    }
  }