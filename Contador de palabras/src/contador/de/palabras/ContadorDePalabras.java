/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador.de.palabras;

/**
 *
 * @author oscar
 */
import java.util.Scanner;

public class ContadorDePalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una oración: ");
        String oracion = scanner.nextLine();
        int contador = 0;
        boolean contar = false;
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) != ' ' && !contar) {
                contar = true;
            } else if (oracion.charAt(i) == ' ') {
                contador++;
                contar = false;
            }
        }
        if (oracion.charAt(oracion.length() - 1) != ' ') {
            contador++;
        }
        System.out.println("Número de palabras: " + contador);
    }
}

