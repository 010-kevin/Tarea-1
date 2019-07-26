/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_clase2;

import java.util.Scanner;

/**
 *
 * @author KEVIN MARTINEZ
 */
public class EJERCICIO4_11 {
    
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    System.out.print("Introduce un número ");
    double base = Double.parseDouble(teclado.nextLine());
    int cont;
    System.out.printf("%15s %15s %15s \n", "Número", "Cuadrado", "Cubo");
    for (cont = 1; cont < 6; cont++){
      double cuadrado = Math.pow(base, 2);
      double cubo = Math.pow(base, 3);
      System.out.printf("%15f %15f %15f \n", base, cuadrado, cubo);
      base++;
    }
    }
    
}
