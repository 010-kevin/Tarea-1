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
public class EJERCICIO4_15 {
    
     public static void main(String[] args) {
    boolean prim = true;
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Introduce el numero ");
    int num = Integer.parseInt(teclado.nextLine());
  
    for (int i = 2; i < num; i++){
      if ((num%i) == 0){
        prim = false;
      } else {
        prim = true;
      }
    }
    System.out.print("El número introducido ");
    if (prim == true){
      System.out.print("es primo.");
    } else {
      System.out.print("no es primo.");
    }
    }
}
