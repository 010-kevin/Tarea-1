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
public class EJERCICIO4_17 {
    
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    System.out.print("Introduce un número entero positivo: ");
    int num = Integer.parseInt(teclado.nextLine());
    
    if (num < 0){
      System.out.print("no es positivo");
    } else {
      System.out.print("La suma de siguientes 100 números a "+num+" son: ");
      int suma = 0;
      for(int i = num; i < (num+100); i++){
        suma += i;
      }
      System.out.print(suma);
    }
    }
    
}
