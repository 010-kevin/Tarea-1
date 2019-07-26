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
public class EJERCICIO4_19 {
    
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(teclado.nextLine());
    
    System.out.print("Introduce el caracter: ");
    String car = teclado.nextLine();
    
    for (int fil = 0; fil < h; ++fil) {
      for (int col = 0; col < h-fil-1; ++col) {
        System.out.print(" ");
      }
      for (int col = 0; col < 2*fil+1; ++col) {
        System.out.print(car);
      }
      System.out.println();
    }
    }
    
}
