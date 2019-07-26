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
public class EJERCICIO4_20 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    System.out.print("Introduce la altura: ");
    int a = Integer.parseInt(teclado.nextLine());
    
    System.out.print("Introduce el caracter: ");
    String car = teclado.nextLine();
    
    for (int fil = 0; fil < a-1; ++fil) {
      for (int col = 0; col < a-fil-1; ++col) {
        System.out.print(" ");
      }
      for (int col = 0; col < 2*fil+1; ++col) {
        if ((col == 0) || (col == 2*fil)){
        System.out.print(car);
        }else { 
        System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int col = 0; col < 2*a-1; ++col) {
      System.out.print(car);
    }
    }
    
}
