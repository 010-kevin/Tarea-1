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
public class EJERCICIO4_12 {
    
    public static void main(String[] args) {
    int cant; 
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.print("Introduce un número ");
      cant = Integer.parseInt(teclado.nextLine());
    } while (cant <= 2);
    int n1 = 0;
    int n2 = 1;
    int fibo = 0;
    System.out.print("Las primeras "+cant+" de la serie de Fibonacci son: "+ n1+" "+n2+ " ");
    for (int i = 0; i < (cant-2); i++){
      fibo = n1 + n2;
      System.out.print(" "+fibo+" ");
      n1 = n2;
      n2 = fibo;
    }
    }
    
}
